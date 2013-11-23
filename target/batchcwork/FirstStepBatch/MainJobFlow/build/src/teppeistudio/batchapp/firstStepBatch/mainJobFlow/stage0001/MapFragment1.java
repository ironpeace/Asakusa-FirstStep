package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
/**
 * {@code [in->padding(pseud#1301353792)]}の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "1")@
        SuppressWarnings("deprecation") public final class MapFragment1 implements Result<ItemMaster> {
    private final Result<ItemMaster> out;
    /**
     * インスタンスを生成する。
     * @param out {@code padding#out}への出力
     */
    public MapFragment1(Result<ItemMaster> out) {
        this.out = out;
    }
    @Override public void add(ItemMaster result) {
        this.out.add(result);
    }
}