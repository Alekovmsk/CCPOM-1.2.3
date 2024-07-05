package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.userEskClassification.UserEsk;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class UserEskIndex implements SearchIndex {
  final UserEsk userEsk;
  private static final List<String> excludeFields = List.of("changeDescription");

  public UserEskIndex(UserEsk userEsk) {
    this.userEsk = userEsk;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(userEsk);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(userEsk.getFullyQualifiedName()).weight(5).build());
    suggest.add(SearchSuggest.builder().input(userEsk.getName()).weight(10).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            userEsk.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    if (userEsk.getDisabled() != null && userEsk.getDisabled()) {
      doc.put("disabled", userEsk.getDisabled());
    } else {
      doc.put("disabled", "false");
    }
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.USERESK);
    return doc;
  }

  public static Map<String, Float> getFields() {
    Map<String, Float> fields = SearchIndex.getDefaultFields();
    fields.put("userEskClassification.name", 1.0f);
    return fields;
  }
}
