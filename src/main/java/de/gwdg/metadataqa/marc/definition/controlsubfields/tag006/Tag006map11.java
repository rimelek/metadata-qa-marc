package de.gwdg.metadataqa.marc.definition.controlsubfields.tag006;

import de.gwdg.metadataqa.marc.Utils;
import de.gwdg.metadataqa.marc.definition.ControlSubfieldDefinition;
import static de.gwdg.metadataqa.marc.definition.FRBRFunction.*;

import java.util.Arrays;

/**
 * Government publication
 * https://www.loc.gov/marc/bibliographic/bd006.html
 */
public class Tag006map11 extends ControlSubfieldDefinition {
  private static Tag006map11 uniqueInstance;

  private Tag006map11() {
    initialize();
    extractValidCodes();
  }

  public static Tag006map11 getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Tag006map11();
    return uniqueInstance;
  }

  private void initialize() {
    label = "Government publication";
    id = "tag006map11";
    mqTag = "governmentPublication";
    positionStart = 11;
    positionEnd = 12;
    descriptionUrl = "https://www.loc.gov/marc/bibliographic/bd006.html";
    codes = Utils.generateCodes(
      " ", "Not a government publication",
      "a", "Autonomous or semi-autonomous component",
      "c", "Multilocal",
      "f", "Federal/national",
      "i", "International intergovernmental",
      "l", "Local",
      "m", "Multistate",
      "o", "Government publication-level undetermined",
      "s", "State, provincial, territorial, dependent, etc.",
      "u", "Unknown if item is government publication",
      "z", "Other",
      "|", "No attempt to code"
    );
    functions = Arrays.asList(DiscoveryIdentify, DiscoverySelect, DiscoveryObtain);
  }
}