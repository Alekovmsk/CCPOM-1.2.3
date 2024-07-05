package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.dlaClassification.Dla;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class DlaIndex implements SearchIndex {
  final Dla dla;
  private static final List<String> excludeFields = List.of("changeDescription");

  public DlaIndex(Dla dla) {
    this.dla = dla;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(dla);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(dla.getFullyQualifiedName()).weight(5).build());
    suggest.add(SearchSuggest.builder().input(dla.getName()).weight(10).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            dla.getFullyQualifiedName(), suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    if (dla.getDisabled() != null && dla.getDisabled()) {
      doc.put("disabled", dla.getDisabled());
    } else {
      doc.put("disabled", "false");
    }
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.DLA);
    return doc;
  }

  public static Map<String, Float> getFields() {
    Map<String, Float> fields = SearchIndex.getDefaultFields();
    fields.put("dlaClassification.name", 1.0f);
    return fields;
  }
}
