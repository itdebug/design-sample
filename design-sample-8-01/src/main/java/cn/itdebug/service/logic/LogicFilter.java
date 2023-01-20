package cn.itdebug.service.logic;

import cn.itdebug.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public interface LogicFilter {



    /**
     * 获取决策值
     * @param treeId
     * @param userId
     * @param decisionMatter 决策物料
     * @return
     */
    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    /**
     * 逻辑决策树
     * @param matterValue 决策值
     * @param treeNodeLinkList 决策节点
     * @return 下一个节点id
     */
    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);



}
