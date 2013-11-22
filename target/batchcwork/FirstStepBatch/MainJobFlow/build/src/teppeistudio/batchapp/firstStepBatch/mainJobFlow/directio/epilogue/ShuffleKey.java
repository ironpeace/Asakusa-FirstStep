package teppeistudio.batchapp.firstStepBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputKey;
import com.asakusafw.runtime.stage.directio.DirectOutputSpec;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.csv.SalesDetail2CsvFormat;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        ShuffleKey extends AbstractDirectOutputKey {
    /**
     * Creates a new instance.
     */
    public ShuffleKey() {
        super(new DirectOutputSpec[]{new DirectOutputSpec(SalesDetail2.class, "firststep_out", SalesDetail2CsvFormat.
                    class, Naming0001.class, Ordering0001.class)});
    }
}