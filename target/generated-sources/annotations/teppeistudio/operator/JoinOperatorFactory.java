package teppeistudio.operator;
import com.asakusafw.vocabulary.flow.Operator;
import com.asakusafw.vocabulary.flow.Source;
import com.asakusafw.vocabulary.flow.graph.FlowBoundary;
import com.asakusafw.vocabulary.flow.graph.FlowElementResolver;
import com.asakusafw.vocabulary.flow.graph.ObservationCount;
import com.asakusafw.vocabulary.flow.graph.OperatorDescription;
import com.asakusafw.vocabulary.flow.graph.ShuffleKey;
import com.asakusafw.vocabulary.operator.KeyInfo;
import com.asakusafw.vocabulary.operator.MasterJoin;
import com.asakusafw.vocabulary.operator.OperatorFactory;
import com.asakusafw.vocabulary.operator.OperatorInfo;
import java.util.Arrays;
import javax.annotation.Generated;
import teppeistudio.modelgen.dmdl.model.ItemMaster;
import teppeistudio.modelgen.dmdl.model.JoinedSalesDetail;
import teppeistudio.modelgen.dmdl.model.SalesDetail;
/**
 * {@link JoinOperator}に関する演算子ファクトリークラス。
 * @see JoinOperator
 */
@Generated("OperatorFactoryClassGenerator:0.0.1")@OperatorFactory(JoinOperator.class) public class JoinOperatorFactory {
    /**
     */
    public static final class JoinedData implements Operator {
        private final FlowElementResolver $;
        /**
         */
        public final Source<JoinedSalesDetail> joined;
        /**
         * 結合に失敗したデータ
         */
        public final Source<SalesDetail> missed;
        JoinedData(Source<ItemMaster> master, Source<SalesDetail> detail) {
            OperatorDescription.Builder builder = new OperatorDescription.Builder(MasterJoin.class);
            builder.declare(JoinOperator.class, JoinOperatorImpl.class, "joinedData");
            builder.declareParameter(ItemMaster.class);
            builder.declareParameter(SalesDetail.class);
            builder.addInput("master", master, new ShuffleKey(Arrays.asList(new String[]{"itemId"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder.addInput("detail", detail, new ShuffleKey(Arrays.asList(new String[]{"itemId"}), Arrays.asList(new 
                    ShuffleKey.Order[]{})));
            builder.addOutput("joined", JoinedSalesDetail.class);
            builder.addOutput("missed", detail);
            builder.addAttribute(FlowBoundary.SHUFFLE);
            builder.addAttribute(ObservationCount.DONT_CARE);
            this.$ = builder.toResolver();
            this.$.resolveInput("master", master);
            this.$.resolveInput("detail", detail);
            this.joined = this.$.resolveOutput("joined");
            this.missed = this.$.resolveOutput("missed");
        }
        /**
         * この演算子の名前を設定する。
         * @param newName 設定する名前
         * @return この演算子オブジェクト (this)
         * @throws IllegalArgumentException 引数に{@code null}が指定された場合
         */
        public JoinOperatorFactory.JoinedData as(String newName) {
            this.$.setName(newName);
            return this;
        }
    }
    /**
     * @param master
     * @param detail
     * @return 生成した演算子オブジェクト
     * @see JoinOperator#joinedData(ItemMaster, SalesDetail)
     */
    @OperatorInfo(kind = MasterJoin.class, input = {@OperatorInfo.Input(name = "master", type = ItemMaster.class, 
                position = 0),@OperatorInfo.Input(name = "detail", type = SalesDetail.class, position = 1)}, output = {@
                OperatorInfo.Output(name = "joined", type = JoinedSalesDetail.class),@OperatorInfo.Output(name = 
                "missed", type = SalesDetail.class)}, parameter = {}) public JoinOperatorFactory.JoinedData joinedData(@
            KeyInfo(group = {@KeyInfo.Group(expression = "itemId")}, order = {}) Source<ItemMaster> master,@KeyInfo(
            group = {@KeyInfo.Group(expression = "itemId")}, order = {}) Source<SalesDetail> detail) {
        return new JoinOperatorFactory.JoinedData(master, detail);
    }
}