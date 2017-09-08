package de.gwdg.metadataqa.marc.definition.general.codelist;

import de.gwdg.metadataqa.marc.Utils;

public class MusicalCompositionSourceCodes extends CodeList {
	static {
		codes = Utils.generateCodes(
				"iamlmf", "International Association of Music Libraries Musical forms codes External Link",
				"marcmuscomp", "MARC Form of Musical Composition Code List"
		);
		indexCodes();
	}

	private static MusicalCompositionSourceCodes uniqueInstance;

	private MusicalCompositionSourceCodes() {
	}

	public static MusicalCompositionSourceCodes getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new MusicalCompositionSourceCodes();
		return uniqueInstance;
	}
}
