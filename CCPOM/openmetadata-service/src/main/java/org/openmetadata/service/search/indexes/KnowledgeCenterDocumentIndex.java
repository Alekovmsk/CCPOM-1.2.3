package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.data.KnowledgeCenterDocument;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class KnowledgeCenterDocumentIndex implements SearchIndex {
  final KnowledgeCenterDocument knowledgeCenterDocument;
  final List<String> excludeFields = List.of("changeDescription");

  public KnowledgeCenterDocumentIndex(KnowledgeCenterDocument knowledgeCenterDocument) {
    this.knowledgeCenterDocument = knowledgeCenterDocument;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(knowledgeCenterDocument);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(knowledgeCenterDocument.getName()).weight(5).build());
    if (knowledgeCenterDocument.getDisplayName() != null && !knowledgeCenterDocument.getDisplayName().isEmpty()) {
      suggest.add(SearchSuggest.builder().input(knowledgeCenterDocument.getDisplayName()).weight(10).build());
    }
    doc.put(
        "fqnParts",
        getFQNParts(
            knowledgeCenterDocument.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.KNOWLEDGE_CENTER_DOCUMENT);
    doc.put("owner", getEntityWithDisplayName(knowledgeCenterDocument.getOwner()));
    doc.put("domain", getEntityWithDisplayName(knowledgeCenterDocument.getDomain()));
    return doc;
  }

  public static Map<String, Float> getFields() {
    Map<String, Float> fields = SearchIndex.getDefaultFields();
    fields.put("synonyms", 5.0f);
    fields.put("synonyms.ngram", 1.0f);
    fields.put("knowledgeCenter.name", 5.0f);
    fields.put("knowledgeCenter.displayName", 5.0f);
    fields.put("knowledgeCenter.displayName.ngram", 1.0f);
    return fields;
  }
}
