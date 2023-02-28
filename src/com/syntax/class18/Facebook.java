package com.syntax.class18;

public class Facebook {

   private String userName;
   private String password;
   private int age;

    void setAge(int personAge) {
        if(personAge>13 && personAge<80){
            age=personAge;
        }else {
            System.out.println("Not Allowed");
        }
    }

    int getAge(String userPassword){
        //protecting the age with a password
        if(userPassword.equals(password)){
            return age;
        }else {
            return -1;
        }

    }


}
