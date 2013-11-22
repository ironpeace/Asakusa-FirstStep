package teppeistudio.batchapp.firstStepBatch.mainJobFlow.directio.epilogue;
import com.asakusafw.runtime.stage.directio.AbstractDirectOutputMapper;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "epilogue.directio") public final class 
        StageMapper0 extends AbstractDirectOutputMapper<SalesDetail2> {
    /**
     * Creates a new instance.
     */
    public StageMapper0() {
        super(0, ShuffleKey.class, ShuffleValue.class);
    }
}