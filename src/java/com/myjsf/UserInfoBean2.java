/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myjsf;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author a-yamamoto
 */
@Named(value = "userInfoBean2")
@SessionScoped
public class UserInfoBean2 implements Serializable {
    String userName;
    String birthDay;
    String gender;
    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public UserInfoBean2() {
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

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String targetPage() {
        System.out.println(gender);
        if(gender.equals("Men")) {
            return "resultForMen";
        }else {
            return "resultForWemen";
        }
    }
    
}
