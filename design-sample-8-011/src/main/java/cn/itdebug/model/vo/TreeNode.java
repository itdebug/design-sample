package cn.itdebug.model.vo;

import java.util.List;

public class TreeNode {

    private Long treeId;

    private Long treeNodeId;

    private Integer nodeType;

    private String nodeValue;

    private String ruleKey;

    private String ruleDesc;

    private List<TreeNodeLink> treeNodeLinkList;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeNodeId() {
        return treeNodeId;
    }

    public void setTreeNodeId(Long treeNodeId) {
        this.treeNodeId = treeNodeId;
    }

    public Integer getNodeType() {
        return nodeType;
    }

    public void setNodeType(Integer nodeType) {
        this.nodeType = nodeType;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }

    public String getRuleKey() {
        return ruleKey;
    }

    public void setRuleKey(String ruleKey) {
        this.ruleKey = ruleKey;
    }

    public String getRuleDesc() {
        return ruleDesc;
    }

    public void setRuleDesc(String ruleDesc) {
        this.ruleDesc = ruleDesc;
    }

    public List<TreeNodeLink> getTreeNodeLinkList() {
        return treeNodeLinkList;
    }

    public void setTreeNodeLinkList(List<TreeNodeLink> treeNodeLinkList) {
        this.treeNodeLinkList = treeNodeLinkList;
    }
}
