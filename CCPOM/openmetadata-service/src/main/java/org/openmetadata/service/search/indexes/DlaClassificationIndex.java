package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.dlaClassification.DlaClassification;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class DlaClassificationIndex implements SearchIndex {

  private static final List<String> excludeFields = List.of("changeDescription");

  final DlaClassification dlaClassification;

  public DlaClassificationIndex(DlaClassification dlaClassification) {
    this.dlaClassification = dlaClassification;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(dlaClassification);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(dlaClassification.getName()).weight(10).build());
    suggest.add(SearchSuggest.builder().input(dlaClassification.getFullyQualifiedName()).weight(5).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            dlaClassification.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.DLACLASSIFICATION);
    doc.put("owner", getEntityWithDisplayName(dlaClassification.getOwner()));
    return doc;
  }
}
