package teppeistudio.batchapp.firstStepBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.StringTemplate;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * A naming output "SalesDetail2" class for "directio".
 */
@SuppressWarnings("deprecation") public final class Naming0001 extends StringTemplate {
    /**
     * Creates a new instance.
     */
    public Naming0001() {
        super(new StringTemplate.FormatSpec(StringTemplate.Format.PLAIN, "sales-detail2.csv"));
    }
    @Override public void set(Object rawObject) {
        SalesDetail2 object = (SalesDetail2) rawObject;
    }
}