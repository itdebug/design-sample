package cn.itdebug.domain;

public class UserInfo {

    private String code;
    private String info;
    private String name;
    private String age;
    private String address;

    public UserInfo() {
    }

    public UserInfo(String code, String age, String address) {
        this.code = code;
        this.age = age;
        this.address = address;
    }

    public UserInfo(String code, String info, String name, String age, String address) {
        this.code = code;
        this.info = info;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
