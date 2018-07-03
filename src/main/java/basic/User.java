package basic;

public class User {
    //editor
    //dai cheng zhi
    //07-03 16:16
    private String name;
    private String phone;
    private String address;
    private String manager;


    public String getAddress() {
        return address;
    }

    public String getManager() {
        return manager;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
