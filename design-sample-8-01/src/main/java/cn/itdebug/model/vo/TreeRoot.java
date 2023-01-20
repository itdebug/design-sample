package cn.itdebug.model.vo;

/**
 * 树根信息
 */
public class TreeRoot {

    /**
     * 规则树id
     */
    private Long treeId;

    /**
     * 规则树根id
     */
    private Long treeRootNodeId;

    /**
     * 规则树名称
     */
    private String treeName;

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getTreeRootNodeId() {
        return treeRootNodeId;
    }

    public void setTreeRootNodeId(Long treeRootNodeId) {
        this.treeRootNodeId = treeRootNodeId;
    }

    public String getTreeName() {
        return treeName;
    }

    public void setTreeName(String treeName) {
        this.treeName = treeName;
    }
}
