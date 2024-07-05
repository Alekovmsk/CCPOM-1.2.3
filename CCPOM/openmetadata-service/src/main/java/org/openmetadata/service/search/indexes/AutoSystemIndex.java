package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.autoSystemClassification.AutoSystem;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class AutoSystemIndex implements SearchIndex {
  final AutoSystem autoSystem;
  private static final List<String> excludeFields = List.of("changeDescription");

  public AutoSystemIndex(AutoSystem autoSystem) {
    this.autoSystem = autoSystem;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(autoSystem);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(autoSystem.getFullyQualifiedName()).weight(5).build());
    suggest.add(SearchSuggest.builder().input(autoSystem.getName()).weight(10).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            autoSystem.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    if (autoSystem.getDisabled() != null && autoSystem.getDisabled()) {
      doc.put("disabled", autoSystem.getDisabled());
    } else {
      doc.put("disabled", "false");
    }
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.AUTOSYSTEM);
    return doc;
  }

  public static Map<String, Float> getFields() {
    Map<String, Float> fields = SearchIndex.getDefaultFields();
    fields.put("autoSystemClassification.name", 1.0f);
    return fields;
  }
}
