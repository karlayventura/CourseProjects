package com.syntax.class22;
class UserClass{
    String name;
    String mobileNumber;

    public UserClass(String name, String mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }
}
class UserInfo extends UserClass {
    String userAddress;

    public UserInfo(String name, String mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }

    void userDetail() {
        System.out.println("name = " + name + " MobileNumber = " + mobileNumber + " Address = " + userAddress);
    }
}
public class Task1 {
    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo("Dmitriy","123456789","USA");
        userInfo.userDetail();
    }
}

