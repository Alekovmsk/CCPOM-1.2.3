package org.openmetadata.service.search.indexes;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.openmetadata.schema.entity.data.ClientCenterClient;
import org.openmetadata.service.Entity;
import org.openmetadata.service.search.SearchIndexUtils;
import org.openmetadata.service.search.models.SearchSuggest;
import org.openmetadata.service.util.JsonUtils;

public class ClientCenterClientIndex implements SearchIndex {
  final ClientCenterClient clientCenterClient;
  final List<String> excludeFields = List.of("changeDescription");

  public ClientCenterClientIndex(ClientCenterClient clientCenterClient) {
    this.clientCenterClient = clientCenterClient;
  }

  public Map<String, Object> buildESDoc() {
    Map<String, Object> doc = JsonUtils.getMap(clientCenterClient);
    SearchIndexUtils.removeNonIndexableFields(doc, excludeFields);
    List<SearchSuggest> suggest = new ArrayList<>();
    suggest.add(SearchSuggest.builder().input(clientCenterClient.getName()).weight(5).build());
    if (clientCenterClient.getDisplayName() != null && !clientCenterClient.getDisplayName().isEmpty()) {
      suggest.add(SearchSuggest.builder().input(clientCenterClient.getDisplayName()).weight(10).build());
    }
    doc.put(
        "fqnParts",
        getFQNParts(
            clientCenterClient.getFullyQualifiedName(),
            suggest.stream().map(SearchSuggest::getInput).collect(Collectors.toList())));
    doc.put("suggest", suggest);
    doc.put("entityType", Entity.CLIENT_CENTER_CLIENT);
    doc.put("owner", getEntityWithDisplayName(clientCenterClient.getOwner()));
    doc.put("domain", getEntityWithDisplayName(clientCenterClient.getDomain()));
    return doc;
  }

  public static Map<String, Float> getFields() {
    Map<String, Float> fields = SearchIndex.getDefaultFields();
    fields.put("synonyms", 5.0f);
    fields.put("synonyms.ngram", 1.0f);
    fields.put("clientCenter.name", 5.0f);
    fields.put("clientCenter.displayName", 5.0f);
    fields.put("clientCenter.displayName.ngram", 1.0f);
    return fields;
  }
}
