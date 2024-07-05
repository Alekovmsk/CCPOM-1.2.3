package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.spdClassification.Spd;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class SpdIndex implements SearchIndex {
  final Spd spd;
  private static final List<String> excludeFields = List.of("changeDescription");

  public SpdIndex(Spd spd) {
    this.spd = spd;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(spd);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(spd.getFullyQualifiedName()).weight(5).build());
    suggest.add(SearchSuggest.builder().input(spd.getName()).weight(10).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            spd.getFullyQualifiedName(), suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    if (spd.getDisabled() != null && spd.getDisabled()) {
      doc.put("disabled", spd.getDisabled());
    } else {
      doc.put("disabled", "false");
    }
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.SPD);
    return doc;
  }

  public static Map<String, Float> getFields() {
    Map<String, Float> fields = SearchIndex.getDefaultFields();
    fields.put("spdClassification.name", 1.0f);
    return fields;
  }
}
