package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@code [in->padding(pseud#30472956)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "2")@
        SuppressWarnings("deprecation") public final class MapFragment2 implements Result<SalesDetail> {
    private final Result<SalesDetail> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment2(Result<SalesDetail> out) {
        this.out = out;
    }
    @Override public void add(SalesDetail result) {
        this.out.add(result);
    }
}