package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.JoinedSalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * {@code [in->project(operator#973617947)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "4")@
        SuppressWarnings("deprecation") public final class MapFragment4 implements Result<JoinedSalesDetail> {
    private final Result<SalesDetail2> out;
    private SalesDetail2 cache = new SalesDetail2();
    /**
     * インスタンスを生成する。
     * @param out {@code project#out}への出力
     */
    public MapFragment4(Result<SalesDetail2> out) {
        this.out = out;
    }
    @Override public void add(JoinedSalesDetail result) {
        this.cache.reset();
        this.cache.setItemNameOption(result.getItemNameOption());
        this.cache.setSalesNumberOption(result.getSalesNumberOption());
        this.cache.setSalesIdOption(result.getSalesIdOption());
        this.cache.setItemIdOption(result.getItemIdOption());
        this.out.add(this.cache);
    }
}