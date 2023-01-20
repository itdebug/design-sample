package cn.itdebug.service.engine;

import cn.itdebug.model.aggregates.TreeRich;
import cn.itdebug.model.vo.EngineResult;
import cn.itdebug.model.vo.TreeNode;
import cn.itdebug.model.vo.TreeRoot;
import cn.itdebug.service.logic.LogicFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

public abstract class EngineBase extends EngineConfig implements IEngine {

    private Logger logger = LoggerFactory.getLogger(EngineBase.class);

    @Override
    public abstract EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter);


    protected TreeNode engineDecisionMaker(TreeRich treeRich, Long treeId, String userId, Map<String, String> decisionMatter) {
        TreeRoot treeRoot = treeRich.getTreeRoot();
        Map<Long, TreeNode> treeNodeMap = treeRich.getTreeNodeMap();

        Long treeRootNodeId = treeRoot.getTreeRootNodeId();
        TreeNode treeNode = treeNodeMap.get(treeRootNodeId);
        while (treeNode.getNodeType().equals(1)) {
            String ruleKey = treeNode.getRuleKey();
            LogicFilter logicFilter = logicFilterMap.get(ruleKey);
            String matterValue = logicFilter.matterValue(treeId, userId, decisionMatter);
            Long nextNode = logicFilter.filter(matterValue, treeNode.getTreeNodeLinkList());
            treeNode = treeNodeMap.get(nextNode);
            logger.info("决策树引擎=>{} userId:{} treeId:{} treeNode:{} ruleKey:{} matterValue:{}",
                    treeRoot.getTreeName(), userId, treeId, treeNode.getTreeNodeId(), ruleKey, matterValue);
        }
        return treeNode;
    }
}
