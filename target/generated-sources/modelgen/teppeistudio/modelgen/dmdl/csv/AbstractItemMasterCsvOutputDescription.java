package teppeistudio.modelgen.dmdl.csv;
import com.asakusafw.vocabulary.directio.DirectFileOutputDescription;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
/**
 * An abstract implementation of {@link ItemMaster} exporter description using Direct I/O CSV.
 */
public abstract class AbstractItemMasterCsvOutputDescription extends DirectFileOutputDescription {
    @Override public Class<? extends ItemMaster> getModelType() {
        return ItemMaster.class;
    }
    @Override public Class<ItemMasterCsvFormat> getFormat() {
        return ItemMasterCsvFormat.class;
    }
}