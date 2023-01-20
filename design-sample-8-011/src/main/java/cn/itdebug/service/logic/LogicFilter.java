package cn.itdebug.service.logic;

import cn.itdebug.model.vo.TreeNodeLink;

import java.util.List;
import java.util.Map;

public interface LogicFilter {

    String matterValue(Long treeId, String userId, Map<String, String> decisionMatter);

    Long filter(String matterValue, List<TreeNodeLink> treeNodeLinkList);
}
