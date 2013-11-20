package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileInputDescription;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * An abstract implementation of {@link SalesDetail2} importer description using Direct I/O CSV.
 */
public abstract class AbstractSalesDetail2CsvInputDescription extends DirectFileInputDescription {
    @Override public Class<? extends SalesDetail2> getModelType() {
        return SalesDetail2.class;
    }
    @Override public Class<SalesDetail2CsvFormat> getFormat() {
        return SalesDetail2CsvFormat.class;
    }
}