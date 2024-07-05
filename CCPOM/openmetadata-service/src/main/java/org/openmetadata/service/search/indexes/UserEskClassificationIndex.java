package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.userEskClassification.UserEskClassification;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class UserEskClassificationIndex implements SearchIndex {

  private static final List<String> excludeFields = List.of("changeDescription");

  final UserEskClassification userEskClassification;

  public UserEskClassificationIndex(UserEskClassification userEskClassification) {
    this.userEskClassification = userEskClassification;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(userEskClassification);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(userEskClassification.getName()).weight(10).build());
    suggest.add(SearchSuggest.builder().input(userEskClassification.getFullyQualifiedName()).weight(5).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            userEskClassification.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.USERESKCLASSIFICATION);
    doc.put("owner", getEntityWithDisplayName(userEskClassification.getOwner()));
    return doc;
  }
}
