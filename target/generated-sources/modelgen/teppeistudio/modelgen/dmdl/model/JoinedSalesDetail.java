package teppeistudio.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.StringOption;
import com.asakusafw.vocabulary.model.Joined;
import com.asakusafw.vocabulary.model.Key;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import teppeistudio.modelgen.dmdl.io.JoinedSalesDetailInput;
import teppeistudio.modelgen.dmdl.io.JoinedSalesDetailOutput;
/**
 * joined_sales_detailを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@Joined(terms = {@Joined.Term(source = ItemMaster.class, mappings = {@Joined.Mapping(source = 
                "itemId", destination = "itemId"),@Joined.Mapping(source = "itemName", destination = "itemName")}, 
            shuffle = @Key(group = {"itemId"})),@Joined.Term(source = SalesDetail.class, mappings = {@Joined.Mapping(
                source = "salesId", destination = "salesId"),@Joined.Mapping(source = "itemId", destination = "itemId"),
                @Joined.Mapping(source = "salesNumber", destination = "salesNumber")}, shuffle = @Key(group = {"itemId"}
            ))})@ModelInputLocation(JoinedSalesDetailInput.class)@ModelOutputLocation(JoinedSalesDetailOutput.class)@
        PropertyOrder({"item_id", "item_name", "sales_id", "sales_number"}) public class JoinedSalesDetail implements 
        DataModel<JoinedSalesDetail>, Writable {
    private final IntOption itemId = new IntOption();
    private final StringOption itemName = new StringOption();
    private final IntOption salesId = new IntOption();
    private final IntOption salesNumber = new IntOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.itemId.setNull();
        this.itemName.setNull();
        this.salesId.setNull();
        this.salesNumber.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(JoinedSalesDetail other) {
        this.itemId.copyFrom(other.itemId);
        this.itemName.copyFrom(other.itemName);
        this.salesId.copyFrom(other.salesId);
        this.salesNumber.copyFrom(other.salesNumber);
    }
    /**
     * item_idを返す。
     * @return item_id
     * @throws NullPointerException item_idの値が<code>null</code>である場合
     */
    public int getItemId() {
        return this.itemId.get();
    }
    /**
     * item_idを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemId(int value) {
        this.itemId.modify(value);
    }
    /**
     * <code>null</code>を許すitem_idを返す。
     * @return item_id
     */
    public IntOption getItemIdOption() {
        return this.itemId;
    }
    /**
     * item_idを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setItemIdOption(IntOption option) {
        this.itemId.copyFrom(option);
    }
    /**
     * item_nameを返す。
     * @return item_name
     * @throws NullPointerException item_nameの値が<code>null</code>である場合
     */
    public Text getItemName() {
        return this.itemName.get();
    }
    /**
     * item_nameを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemName(Text value) {
        this.itemName.modify(value);
    }
    /**
     * <code>null</code>を許すitem_nameを返す。
     * @return item_name
     */
    public StringOption getItemNameOption() {
        return this.itemName;
    }
    /**
     * item_nameを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setItemNameOption(StringOption option) {
        this.itemName.copyFrom(option);
    }
    /**
     * sales_idを返す。
     * @return sales_id
     * @throws NullPointerException sales_idの値が<code>null</code>である場合
     */
    public int getSalesId() {
        return this.salesId.get();
    }
    /**
     * sales_idを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setSalesId(int value) {
        this.salesId.modify(value);
    }
    /**
     * <code>null</code>を許すsales_idを返す。
     * @return sales_id
     */
    public IntOption getSalesIdOption() {
        return this.salesId;
    }
    /**
     * sales_idを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setSalesIdOption(IntOption option) {
        this.salesId.copyFrom(option);
    }
    /**
     * sales_numberを返す。
     * @return sales_number
     * @throws NullPointerException sales_numberの値が<code>null</code>である場合
     */
    public int getSalesNumber() {
        return this.salesNumber.get();
    }
    /**
     * sales_numberを設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setSalesNumber(int value) {
        this.salesNumber.modify(value);
    }
    /**
     * <code>null</code>を許すsales_numberを返す。
     * @return sales_number
     */
    public IntOption getSalesNumberOption() {
        return this.salesNumber;
    }
    /**
     * sales_numberを設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setSalesNumberOption(IntOption option) {
        this.salesNumber.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=joined_sales_detail");
        result.append(", itemId=");
        result.append(this.itemId);
        result.append(", itemName=");
        result.append(this.itemName);
        result.append(", salesId=");
        result.append(this.salesId);
        result.append(", salesNumber=");
        result.append(this.salesNumber);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + itemId.hashCode();
        result = prime * result + itemName.hashCode();
        result = prime * result + salesId.hashCode();
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
        JoinedSalesDetail other = (JoinedSalesDetail) obj;
        if(this.itemId.equals(other.itemId) == false) {
            return false;
        }
        if(this.itemName.equals(other.itemName) == false) {
            return false;
        }
        if(this.salesId.equals(other.salesId) == false) {
            return false;
        }
        if(this.salesNumber.equals(other.salesNumber) == false) {
            return false;
        }
        return true;
    }
    /**
     * item_nameを返す。
     * @return item_name
     * @throws NullPointerException item_nameの値が<code>null</code>である場合
     */
    public String getItemNameAsString() {
        return this.itemName.getAsString();
    }
    /**
     * item_nameを設定する。
     * @param itemName0 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemNameAsString(String itemName0) {
        this.itemName.modify(itemName0);
    }
    @Override public void write(DataOutput out) throws IOException {
        itemId.write(out);
        itemName.write(out);
        salesId.write(out);
        salesNumber.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        itemId.readFields(in);
        itemName.readFields(in);
        salesId.readFields(in);
        salesNumber.readFields(in);
    }
}