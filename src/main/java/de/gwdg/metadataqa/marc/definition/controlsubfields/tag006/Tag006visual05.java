package de.gwdg.metadataqa.marc.definition.controlsubfields.tag006;

import de.gwdg.metadataqa.marc.Utils;
import de.gwdg.metadataqa.marc.definition.ControlSubfieldDefinition;
import static de.gwdg.metadataqa.marc.definition.FRBRFunction.*;

import java.util.Arrays;

/**
 * Target audience
 * https://www.loc.gov/marc/bibliographic/bd006.html
 */
public class Tag006visual05 extends ControlSubfieldDefinition {
  private static Tag006visual05 uniqueInstance;

  private Tag006visual05() {
    initialize();
    extractValidCodes();
  }

  public static Tag006visual05 getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Tag006visual05();
    return uniqueInstance;
  }

  private void initialize() {
    label = "Target audience";
    id = "tag006visual05";
    mqTag = "targetAudience";
    positionStart = 5;
    positionEnd = 6;
    descriptionUrl = "https://www.loc.gov/marc/bibliographic/bd006.html";
    codes = Utils.generateCodes(
      " ", "Unknown or not specified",
      "a", "Preschool",
      "b", "Primary",
      "c", "Pre-adolescent",
      "d", "Adolescent",
      "e", "Adult",
      "f", "Specialized",
      "g", "General",
      "j", "Juvenile",
      "|", "No attempt to code"
    );
    functions = Arrays.asList(DiscoverySelect);
  }
}