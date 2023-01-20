package cn.itdebug.service.logic;

import cn.itdebug.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public abstract class BaseLogic implements LogicFilter {

    public abstract String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    @Override
    public Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList) {

        for(TreeNodeLink treeNodeLink:treeNodeLinkList) {
            if(decision(matterValue, treeNodeLink)) {
                return treeNodeLink.getNodeIdTo();
            }
        }
        return null;
    }

    private boolean decision(String matterValue, TreeNodeLink treeNodeLink) {
        switch (treeNodeLink.getRuleLimitType()) {
            case 1:
                return matterValue.equals(treeNodeLink.getRuleLimitValue());
            case 2:
                return Double.parseDouble(matterValue) > Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 3:
                return Double.parseDouble(matterValue) < Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 4:
                return Double.parseDouble(matterValue) >= Double.parseDouble(treeNodeLink.getRuleLimitValue());
            case 5:
                return Double.parseDouble(matterValue) <= Double.parseDouble(treeNodeLink.getRuleLimitValue());
            default:
                return false;
        }
    }
}
