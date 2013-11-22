package teppeistudio.batchapp.firstStepBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.DirectOutputOrder;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * An ordering output "SalesDetail2" class for "directio".
 */
public final class Ordering0001 extends DirectOutputOrder {
    /**
     * Creates a new instance.
     */
    public Ordering0001() {
        super();
    }
    @Override public void set(Object rawObject) {
        SalesDetail2 object = (SalesDetail2) rawObject;
    }
}