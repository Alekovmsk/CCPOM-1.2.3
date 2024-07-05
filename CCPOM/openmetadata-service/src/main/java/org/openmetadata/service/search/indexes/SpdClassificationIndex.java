package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.spdClassification.SpdClassification;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class SpdClassificationIndex implements SearchIndex {

  private static final List<String> excludeFields = List.of("changeDescription");

  final SpdClassification spdClassification;

  public SpdClassificationIndex(SpdClassification spdClassification) {
    this.spdClassification = spdClassification;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(spdClassification);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(spdClassification.getName()).weight(10).build());
    suggest.add(SearchSuggest.builder().input(spdClassification.getFullyQualifiedName()).weight(5).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            spdClassification.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.SPDCLASSIFICATION);
    doc.put("owner", getEntityWithDisplayName(spdClassification.getOwner()));
    return doc;
  }
}
