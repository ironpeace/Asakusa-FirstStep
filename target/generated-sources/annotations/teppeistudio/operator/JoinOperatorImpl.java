package teppeistudio.operator;
import javax.annotation.Generated;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
import teppeistudio.modelgen.dmdl.model.JoinedSalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@link JoinOperator}に関する演算子実装クラス。
 */
@Generated("OperatorImplementationClassGenerator:0.0.1") public class JoinOperatorImpl extends JoinOperator {
    /**
     * インスタンスを生成する。
     */
    public JoinOperatorImpl() {
        return;
    }
    @Override public JoinedSalesDetail joinedData(ItemMaster master, SalesDetail detail) {
        throw new UnsupportedOperationException("マスタ結合演算子は組み込みの方法で処理されます");
    }
}