package cn.itdebug.service.engine.impl;

import cn.itdebug.model.aggregates.TreeRich;
import cn.itdebug.model.vo.EngineResult;
import cn.itdebug.model.vo.TreeNode;
import cn.itdebug.service.engine.EngineBase;

import java.util.Map;

public class TreeEngineHandler extends EngineBase {

    @Override
    public EngineResult process(Long treeId, String userId, TreeRich treeRich, Map<String, String> decisionMatter) {
        TreeNode treeNode = engineDecisionMaker(treeRich, treeId, userId, decisionMatter);
        return new EngineResult(userId, treeId, treeNode.getTreeNodeId(), treeNode.getNodeValue());
    }
}
