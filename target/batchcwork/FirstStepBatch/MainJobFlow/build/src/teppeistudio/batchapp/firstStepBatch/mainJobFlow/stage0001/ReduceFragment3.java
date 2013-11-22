package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.trace.TraceLocation;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
import teppeistudio.modelgen.dmdl.model.JoinedSalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@code [master->JoinOperator.joinedData(operator#590996305), detail->JoinOperator.joinedData(operator#590996305)]}
         * の処理を担当するマッププログラムの断片。
 */
@TraceLocation(batchId = "FirstStepBatch", flowId = "MainJobFlow", stageId = "stage0001", fragmentId = "3")@
        SuppressWarnings("deprecation") public final class ReduceFragment3 extends com.asakusafw.runtime.flow.Rendezvous
        <ShuffleValue> {
    private final Result<JoinedSalesDetail> joined;
    private final Result<SalesDetail> missed;
    private boolean sawMaster;
    private ItemMaster cache = new ItemMaster();
    private JoinedSalesDetail cache0 = new JoinedSalesDetail();
    /**
     * インスタンスを生成する。
     * @param joined {@code JoinOperator.joinedData#joined}への出力
     * @param missed {@code JoinOperator.joinedData#missed}への出力
     */
    public ReduceFragment3(Result<JoinedSalesDetail> joined, Result<SalesDetail> missed) {
        this.joined = joined;
        this.missed = missed;
    }
    @Override public void process(ShuffleValue value) {
        switch(value.getSegmentId()) {
            case 1:
                this.process0001(value.getPort1());
                break;
            case 2:
                this.process0002(value.getPort2());
                break;
            default:
                throw new AssertionError(value);
        }
    }
    @Override public void begin() {
        this.sawMaster = false;
    }
    @Override public void end() {
    }
    private void process0001(ItemMaster value) {
        if(this.sawMaster == false) {
            this.cache.copyFrom(value);
            this.sawMaster = true;
        }
    }
    private void process0002(SalesDetail value) {
        if(this.sawMaster) {
            this.cache0.reset();
            this.cache0.setItemIdOption(this.cache.getItemIdOption());
            this.cache0.setItemNameOption(this.cache.getItemNameOption());
            this.cache0.setSalesIdOption(value.getSalesIdOption());
            this.cache0.setSalesNumberOption(value.getSalesNumberOption());
            this.joined.add(this.cache0);
        }
        else {
            this.missed.add(value);
        }
    }
}