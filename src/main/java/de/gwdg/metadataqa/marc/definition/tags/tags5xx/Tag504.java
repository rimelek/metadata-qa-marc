package de.gwdg.metadataqa.marc.definition.tags.tags5xx;

import de.gwdg.metadataqa.marc.definition.Cardinality;
import de.gwdg.metadataqa.marc.definition.DataFieldDefinition;
import de.gwdg.metadataqa.marc.definition.Indicator;
import de.gwdg.metadataqa.marc.definition.general.parser.LinkageParser;
import static de.gwdg.metadataqa.marc.definition.FRBRFunction.*;

/**
 * Bibliography, etc. Note
 * http://www.loc.gov/marc/bibliographic/bd504.html
 */
public class Tag504 extends DataFieldDefinition {

  private static Tag504 uniqueInstance;

  private Tag504() {
    initialize();
    postCreation();
  }

  public static Tag504 getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Tag504();
    return uniqueInstance;
  }

  private void initialize() {

    tag = "504";
    label = "Bibliography, etc. Note";
    mqTag = "Bibliography";
    cardinality = Cardinality.Repeatable;
    descriptionUrl = "https://www.loc.gov/marc/bibliographic/bd504.html";
    setCompilanceLevels("O");

    ind1 = new Indicator();
    ind2 = new Indicator();

    setSubfieldsWithCardinality(
      "a", "Bibliography, etc. note", "NR",
      "b", "Number of references", "NR",
      "6", "Linkage", "NR",
      "8", "Field link and sequence number", "R"
    );

    getSubfield("6").setContentParser(LinkageParser.getInstance());

    getSubfield("a")
      .setMqTag("rdf:value")
      .setFrbrFunctions(DiscoverySelect)
      .setCompilanceLevels("M");

    getSubfield("b")
      .setBibframeTag("count")
      .setCompilanceLevels("O");

    getSubfield("6")
      .setBibframeTag("linkage")
      .setFrbrFunctions(ManagementIdentify, ManagementProcess)
      .setCompilanceLevels("A");

    getSubfield("8")
      .setMqTag("fieldLink")
      .setFrbrFunctions(ManagementIdentify, ManagementProcess)
      .setCompilanceLevels("O");
  }
}
