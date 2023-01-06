package org.itdebug.crm.goods;

public class DeliverReq {

    /**
     * 下单人姓名
     */
    private String name;
    /**
     * 下单人手机号
     */
    private String mobile;

    /**
     * 订单号
     */
    private String orderId;

    /**
     * 订单商品
     */
    private String sku;

    /**
     * 收货人姓名
     */
    private String deliverUserName;
    /**
     * 收货人手机号
     */
    private String deliverUserMobile;
    /**
     * 收货人地址
     */
    private String deliverUserAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getDeliverUserName() {
        return deliverUserName;
    }

    public void setDeliverUserName(String deliverUserName) {
        this.deliverUserName = deliverUserName;
    }

    public String getDeliverUserMobile() {
        return deliverUserMobile;
    }

    public void setDeliverUserMobile(String deliverUserMobile) {
        this.deliverUserMobile = deliverUserMobile;
    }

    public String getDeliverUserAddress() {
        return deliverUserAddress;
    }

    public void setDeliverUserAddress(String deliverUserAddress) {
        this.deliverUserAddress = deliverUserAddress;
    }

    @Override
    public String toString() {
        return "DeliverReq{" +
                "name='" + name + '\'' +
                ", mobile='" + mobile + '\'' +
                ", orderId='" + orderId + '\'' +
                ", sku='" + sku + '\'' +
                ", deliverUserName='" + deliverUserName + '\'' +
                ", deliverUserMobile='" + deliverUserMobile + '\'' +
                ", deliverUserAddress='" + deliverUserAddress + '\'' +
                '}';
    }
}
