package com.test;

import com.beans.UserBean;

public class Test {
    public static void main(String[] args) {
        UserBean user = new UserBean();
        user.setUserId("AN1234");
        user.setUserName("ankitaryasam");
        System.out.println(user);
    }
}
