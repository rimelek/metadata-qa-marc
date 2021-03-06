package de.gwdg.metadataqa.marc;

import de.gwdg.metadataqa.marc.model.SolrFieldType;

import java.util.List;
import java.util.Map;

public interface Extractable {

  public Map<String, List<String>> getKeyValuePairs();
  public Map<String, List<String>> getKeyValuePairs(SolrFieldType type);
}
