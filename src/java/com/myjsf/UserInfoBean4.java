/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjsf;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author a-yamamoto
 */
@Named(value = "userInfoBean4")
@RequestScoped
public class UserInfoBean4 {
    String userName;
    String birthDay;

    /**
     * Creates a new instance of UserInfoBean4
     */
    public UserInfoBean4() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthday) {
        this.birthDay = birthday;
    }
    
    
    
}
