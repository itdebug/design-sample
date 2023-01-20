package cn.itdebug.model.vo;

/**
 * 决策结果
 */
public class EngineResult {

    /**
     * 执行结果
     */
    private boolean isSuccess;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 规则树id
     */
    private Long treeId;

    /**
     * 果实节点id
     */
    private Long nodeId;

    /**
     * 果实节点值
     */
    private String nodeValue;


    public EngineResult( String userId, Long treeId, Long nodeId, String nodeValue) {
        this.userId = userId;
        this.treeId = treeId;
        this.nodeId = nodeId;
        this.nodeValue = nodeValue;
    }

    public boolean isSuccess() {
        return isSuccess;
    }

    public void setSuccess(boolean success) {
        isSuccess = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Long getTreeId() {
        return treeId;
    }

    public void setTreeId(Long treeId) {
        this.treeId = treeId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeValue() {
        return nodeValue;
    }

    public void setNodeValue(String nodeValue) {
        this.nodeValue = nodeValue;
    }
}
