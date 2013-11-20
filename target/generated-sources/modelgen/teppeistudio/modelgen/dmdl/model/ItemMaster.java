package teppeistudio.modelgen.dmdl.model;
import com.asakusafw.runtime.model.DataModel;
import com.asakusafw.runtime.model.DataModelKind;
import com.asakusafw.runtime.model.ModelInputLocation;
import com.asakusafw.runtime.model.ModelOutputLocation;
import com.asakusafw.runtime.model.PropertyOrder;
import com.asakusafw.runtime.value.IntOption;
import com.asakusafw.runtime.value.StringOption;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.io.Writable;
import teppeistudio.modelgen.dmdl.io.ItemMasterInput;
import teppeistudio.modelgen.dmdl.io.ItemMasterOutput;
/**
 * 商品マスタを表すデータモデルクラス。
 */
@DataModelKind("DMDL")@ModelInputLocation(ItemMasterInput.class)@ModelOutputLocation(ItemMasterOutput.class)@
        PropertyOrder({"item_id", "item_name"}) public class ItemMaster implements DataModel<ItemMaster>, Writable {
    private final IntOption itemId = new IntOption();
    private final StringOption itemName = new StringOption();
    @Override@SuppressWarnings("deprecation") public void reset() {
        this.itemId.setNull();
        this.itemName.setNull();
    }
    @Override@SuppressWarnings("deprecation") public void copyFrom(ItemMaster other) {
        this.itemId.copyFrom(other.itemId);
        this.itemName.copyFrom(other.itemName);
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
     * 商品名を返す。
     * @return 商品名
     * @throws NullPointerException 商品名の値が<code>null</code>である場合
     */
    public Text getItemName() {
        return this.itemName.get();
    }
    /**
     * 商品名を設定する。
     * @param value 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemName(Text value) {
        this.itemName.modify(value);
    }
    /**
     * <code>null</code>を許す商品名を返す。
     * @return 商品名
     */
    public StringOption getItemNameOption() {
        return this.itemName;
    }
    /**
     * 商品名を設定する。
     * @param option 設定する値、<code>null</code>の場合にはこのプロパティが<code>null</code>を表すようになる
     */
    @SuppressWarnings("deprecation") public void setItemNameOption(StringOption option) {
        this.itemName.copyFrom(option);
    }
    @Override public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("{");
        result.append("class=item_master");
        result.append(", itemId=");
        result.append(this.itemId);
        result.append(", itemName=");
        result.append(this.itemName);
        result.append("}");
        return result.toString();
    }
    @Override public int hashCode() {
        int prime = 31;
        int result = 1;
        result = prime * result + itemId.hashCode();
        result = prime * result + itemName.hashCode();
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
        ItemMaster other = (ItemMaster) obj;
        if(this.itemId.equals(other.itemId) == false) {
            return false;
        }
        if(this.itemName.equals(other.itemName) == false) {
            return false;
        }
        return true;
    }
    /**
     * 商品名を返す。
     * @return 商品名
     * @throws NullPointerException 商品名の値が<code>null</code>である場合
     */
    public String getItemNameAsString() {
        return this.itemName.getAsString();
    }
    /**
     * 商品名を設定する。
     * @param itemName0 設定する値
     */
    @SuppressWarnings("deprecation") public void setItemNameAsString(String itemName0) {
        this.itemName.modify(itemName0);
    }
    @Override public void write(DataOutput out) throws IOException {
        itemId.write(out);
        itemName.write(out);
    }
    @Override public void readFields(DataInput in) throws IOException {
        itemId.readFields(in);
        itemName.readFields(in);
    }
}