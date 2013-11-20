package teppeistudio.jobflow;

import teppeistudio.modelgen.dmdl.csv.AbstractSalesDetail2CsvOutputDescription;

public class SalesDetail2ToCsv extends AbstractSalesDetail2CsvOutputDescription {

	@Override
	public String getBasePath() {
		return "firststep_out";
	}

	@Override
	public String getResourcePattern() {
		return "sales-detail2.csv";
	}

}
