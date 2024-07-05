package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.domains.Perimeter;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class PerimeterIndex implements SearchIndex {

  private static final List<String> excludeFields = List.of("changeDescription");

  final Perimeter perimeter;

  public PerimeterIndex(Perimeter perimeter) {
    this.perimeter = perimeter;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(perimeter);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(perimeter.getName()).weight(5).build());
    suggest.add(SearchSuggest.builder().input(perimeter.getFullyQualifiedName()).weight(5).build());
    doc.put(
        "fqnParts",
        getFQNParts(
            perimeter.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    doc.put("entityType", Entity.PERIMETER);
    doc.put("owner", getEntityWithDisplayName(perimeter.getOwner()));
    doc.put("domain", getEntityWithDisplayName(perimeter.getDomain()));
    return doc;
  }

  public static Map<String, Float> getFields() {
    return SearchIndex.getDefaultFields();
  }
}
