package teppeistudio.batchapp.firstStepBatch.mainJobFlow.stage0001;
import com.asakusafw.runtime.flow.SegmentedWritable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * ステージ#1シャッフルで利用する値クラス。
 */
@SuppressWarnings("deprecation") public final class ShuffleValue implements SegmentedWritable {
    /**
     * セグメント番号。
     */
    public int segmentId = -1;
    @Override public int getSegmentId() {
        return this.segmentId;
    }
    /**
     * JoinOperator.joinedData#masterが利用するモデル (1)。
     */
    public ItemMaster port0001 = new ItemMaster();
    /**
     * JoinOperator.joinedData#detailが利用するモデル (2)。
     */
    public SalesDetail port0002 = new SalesDetail();
    /**
     * JoinOperator.joinedData#masterのモデルオブジェクトを返す。
     */
    public ItemMaster getPort1() {
        if(this.segmentId != 1) throw new AssertionError();
        return this.port0001;
    }
    /**
     * JoinOperator.joinedData#masterで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort1(ItemMaster model) {
        this.segmentId = 1;
        this.port0001.copyFrom(model);
    }
    /**
     * JoinOperator.joinedData#detailのモデルオブジェクトを返す。
     */
    public SalesDetail getPort2() {
        if(this.segmentId != 2) throw new AssertionError();
        return this.port0002;
    }
    /**
     * JoinOperator.joinedData#detailで使用するモデルオブジェクトを設定する。
     * @param model 設定するモデルオブジェクト
     */
    public void setPort2(SalesDetail model) {
        this.segmentId = 2;
        this.port0002.copyFrom(model);
    }
    @Override public void write(DataOutput out) throws IOException {
        switch(this.segmentId) {
            case 1:
                out.writeInt(1);
                this.port0001.write(out);
                break;
            case 2:
                out.writeInt(2);
                this.port0002.write(out);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
    @Override public void readFields(DataInput in) throws IOException {
        this.segmentId = in.readInt();
        switch(this.segmentId) {
            case 1:
                this.port0001.readFields(in);
                break;
            case 2:
                this.port0002.readFields(in);
                break;
            default:
                throw new AssertionError(this.segmentId);
        }
    }
}