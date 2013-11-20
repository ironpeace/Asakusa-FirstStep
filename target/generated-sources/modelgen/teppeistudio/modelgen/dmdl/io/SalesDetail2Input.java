package teppeistudio.modelgen.dmdl.io;
import com.asakusafw.runtime.io.ModelInput;
import com.asakusafw.runtime.io.RecordParser;
import java.io.IOException;
import teppeistudio.modelgen.dmdl.model.SalesDetail2;
/**
 * TSVファイルなどのレコードを表すファイルを入力として<code>sales_detail2</code>を読み出す
 */
public final class SalesDetail2Input implements ModelInput<SalesDetail2> {
    private final RecordParser parser;
    /**
     * インスタンスを生成する。
     * @param parser 利用するパーサー
     * @throws IllegalArgumentException 引数に<code>null</code>が指定された場合
     */
    public SalesDetail2Input(RecordParser parser) {
        if(parser == null) {
            throw new IllegalArgumentException("parser");
        }
        this.parser = parser;
    }
    @Override public boolean readTo(SalesDetail2 model) throws IOException {
        if(parser.next() == false) {
            return false;
        }
        parser.fill(model.getSalesIdOption());
        parser.fill(model.getItemIdOption());
        parser.fill(model.getItemNameOption());
        parser.fill(model.getSalesNumberOption());
        parser.endRecord();
        return true;
    }
    @Override public void close() throws IOException {
        parser.close();
    }
}