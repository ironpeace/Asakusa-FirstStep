package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.core.Result;
import com.asakusafw.runtime.flow.ResultOutput;
import org.apache.hadoop.mapreduce.TaskInputOutputContext;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@code detail->JoinOperator.joinedData(operator#3154093)}へのシャッフル処理を担当するプログラムの断片。
 */
@SuppressWarnings("deprecation") public final class MapOutputFragment2 implements Result<SalesDetail> {
    private final TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector;
    private final ShuffleKey key = new ShuffleKey();
    private final ShuffleValue value = new ShuffleValue();
    /**
     * インスタンスを生成する。
     * @param collector 実際の出力先
     */
    public MapOutputFragment2(TaskInputOutputContext<?, ?, ? super ShuffleKey, ? super ShuffleValue> collector) {
        this.collector = collector;
    }
    @Override public void add(SalesDetail result) {
        this.key.setPort2(result);
        this.value.setPort2(result);
        ResultOutput.write(this.collector, this.key, this.value);
    }
}