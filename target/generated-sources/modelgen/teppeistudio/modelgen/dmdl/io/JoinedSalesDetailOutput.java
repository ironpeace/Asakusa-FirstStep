package teppeistudio.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelOutput;
import com.asakusafw.runtime.io.RecordEmitter;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.JoinedSalesDetail;
/**
 * <code>joined_sales_detail</code>をTSVなどのレコード形式で出力する。
 */
public final class JoinedSalesDetailOutput implements ModelOutput<JoinedSalesDetail> {
    private final RecordEmitter emitter;
    /**
     * インスタンスを生成する。
     * @param emitter 利用するエミッター
     * @throws IllegalArgumentException 引数にnullが指定された場合
     */
    public JoinedSalesDetailOutput(RecordEmitter emitter) {
        if(emitter == null) {
            throw new IllegalArgumentException();
        }
        this.emitter = emitter;
    }
    @Override public void write(JoinedSalesDetail model) throws IOException {
        emitter.emit(model.getItemIdOption());
        emitter.emit(model.getItemNameOption());
        emitter.emit(model.getSalesIdOption());
        emitter.emit(model.getSalesNumberOption());
        emitter.endRecord();
    }
    @Override public void close() throws IOException {
        emitter.close();
    }
}