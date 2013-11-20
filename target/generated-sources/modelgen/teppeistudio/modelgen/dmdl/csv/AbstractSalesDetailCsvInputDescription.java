package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * An abstract implementation of {@link SalesDetail} importer description using Direct I/O CSV.
 */
public abstract class AbstractSalesDetailCsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends SalesDetail> getModelType() {
        return SalesDetail.class;
    }
    @Override public Class<SalesDetailCsvFormat> getFormat() {
        return SalesDetailCsvFormat.class;
    }
}