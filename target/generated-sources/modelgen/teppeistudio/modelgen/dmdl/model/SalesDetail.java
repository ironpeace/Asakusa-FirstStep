package teppeistudio.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.IntOption;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Writable;
import teppeistudio.modelgen.dmdl.io.SalesDetailInput;
import teppeistudio.modelgen.dmdl.io.SalesDetailOutput;
/**
 * 売上明細を表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(SalesDetailInput.class)@ModelOutputLocation(SalesDetailOutput.class)@
        PropertyOrder({"sales_id", "item_id", "sales_number"}) public class SalesDetail implements DataModel<SalesDetail
        >, Writable {
    private final IntOption salesId = new IntOption();
    private final IntOption itemId = new IntOption();
    private final IntOption salesNumber = new IntOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.salesId.setNull();
        this.itemId.setNull();
        this.salesNumber.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(SalesDetail other) {
        this.salesId.copyFrom(other.salesId);
        this.itemId.copyFrom(other.itemId);
        this.salesNumber.copyFrom(other.salesNumber);
    }
    /**
     * 明細IDを返す。
     * @return 明細ID
     * @throws NullPointerException 明細IDの値が<code>null</code>である場合
     */
    public int getSalesId() {
        return this.salesId.get();
    }
    /**
     * 明細IDを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setSalesId(int value) {
        this.salesId.modify(value);
    }
    /**
     * <code>null</code>を許す明細IDを返す。
     * @return 明細ID
     */
    public IntOption getSalesIdOption() {
        return this.salesId;
    }
    /**
     * 明細IDを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setSalesIdOption(IntOption option) {
        this.salesId.copyFrom(option);
    }
    /**
     * 商品IDを返す。
     * @return 商品ID
     * @throws NullPointerException 商品IDの値が<code>null</code>である場合
     */
    public int getItemId() {
        return this.itemId.get();
    }
    /**
     * 商品IDを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemId(int value) {
        this.itemId.modify(value);
    }
    /**
     * <code>null</code>を許す商品IDを返す。
     * @return 商品ID
     */
    public IntOption getItemIdOption() {
        return this.itemId;
    }
    /**
     * 商品IDを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setItemIdOption(IntOption option) {
        this.itemId.copyFrom(option);
    }
    /**
     * 売上数を返す。
     * @return 売上数
     * @throws NullPointerException 売上数の値が<code>null</code>である場合
     */
    public int getSalesNumber() {
        return this.salesNumber.get();
    }
    /**
     * 売上数を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setSalesNumber(int value) {
        this.salesNumber.modify(value);
    }
    /**
     * <code>null</code>を許す売上数を返す。
     * @return 売上数
     */
    public IntOption getSalesNumberOption() {
        return this.salesNumber;
    }
    /**
     * 売上数を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setSalesNumberOption(IntOption option) {
        this.salesNumber.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=sales_detail");
        result.append(", salesId=");
        result.append(this.salesId);
        result.append(", itemId=");
        result.append(this.itemId);
        result.append(", salesNumber=");
        result.append(this.salesNumber);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + salesId.hashCode();
        result = prime * result + itemId.hashCode();
        result = prime * result + salesNumber.hashCode();
        return result;
    }
    @Override public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        if(obj == null) {
            return false;
        }
        if(this.getClass() != obj.getClass()) {
            return false;
        }
        SalesDetail other = (SalesDetail) obj;
        if(this.salesId.equals(other.salesId) == false) {
            return false;
        }
        if(this.itemId.equals(other.itemId) == false) {
            return false;
        }
        if(this.salesNumber.equals(other.salesNumber) == false) {
            return false;
        }
        return true;
    }
    @Override public void write(DataOutput out) throws IOException {
        salesId.write(out);
        itemId.write(out);
        salesNumber.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        salesId.readFields(in);
        itemId.readFields(in);
        salesNumber.readFields(in);
    }
}