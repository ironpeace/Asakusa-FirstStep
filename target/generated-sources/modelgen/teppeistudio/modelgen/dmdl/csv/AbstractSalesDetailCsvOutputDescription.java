package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * An abstract implementation of {@link SalesDetail} exporter description using Direct I/O CSV.
 */
public abstract class AbstractSalesDetailCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends SalesDetail> getModelType() {
        return SalesDetail.class;
    }
    @Override public Class<SalesDetailCsvFormat> getFormat() {
        return SalesDetailCsvFormat.class;
    }
}