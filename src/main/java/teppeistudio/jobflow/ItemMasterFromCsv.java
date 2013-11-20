package teppeistudio.jobflow;

import teppeistudio.modelgen.dmdl.csv.AbstractItemMasterCsvInputDescription;

public class ItemMasterFromCsv extends AbstractItemMasterCsvInputDescription {

	@Override
	public String getBasePath() {
		return "firststep";
	}

	@Override
	public String getResourcePattern() {
		return "item-master.csv";
	}

}
