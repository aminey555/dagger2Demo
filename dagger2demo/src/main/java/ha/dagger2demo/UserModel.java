package ha.dagger2demo;

/**
 * Created by yuexi on 2016/9/27.
 */
public class UserModel {

    private String userName;
    private String userPass;
    private String address;


    public UserModel() {
    }

    public UserModel(String userName, String userPass, String address) {
        this.userName = userName;
        this.userPass = userPass;
        this.address = address;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
