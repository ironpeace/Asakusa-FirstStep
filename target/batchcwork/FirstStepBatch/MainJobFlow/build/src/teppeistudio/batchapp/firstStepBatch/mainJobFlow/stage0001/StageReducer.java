package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.Rendezvous;
import com.asakusafw.runtime.flow.SegmentedReducer;
import com.asakusafw.runtime.flow.VoidResult;
import com.asakusafw.runtime.stage.output.StageOutputDriver;
import com.asakusafw.runtime.trace.TraceLocation;
import java.io.IOException;
import org.apache.hadoop.io.NullWritable;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * ステージ1の処理を担当するレデュースプログラム。
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "stage0001", stageUnitId = "r")@
        SuppressWarnings("deprecation") public final class StageReducer extends SegmentedReducer<ShuffleKey, 
        ShuffleValue, NullWritable, NullWritable> {
    private StageOutputDriver outputs;
    private ReduceFragment3 rendezvous;
    @Override public void setup(Context context) throws IOException, InterruptedException {
        this.outputs = new StageOutputDriver(context);
        final Result<SalesDetail2> output = outputs.getResultSink("result0");
        final MapFragment4 line = new MapFragment4(output);
        this.rendezvous = new ReduceFragment3(line, new VoidResult<SalesDetail>());
    }
    @Override public void cleanup(Context context) throws IOException, InterruptedException {
        this.outputs.close();
        this.outputs = null;
        this.rendezvous = null;
    }
    @Override protected Rendezvous<ShuffleValue> getRendezvous(ShuffleKey nextKey) {
        switch(nextKey.getSegmentId()) {
            case 1:
            case 2:
                return this.rendezvous;
            default:
                throw new AssertionError();
        }
    }
}