package com.myjsf;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author a-yamamoto
 */
@Named(value = "travelBean")
@RequestScoped
public class TravelBean {
    String area;     //地域
    String purpose;  //何をしたいか
    String comment;  //要望

    /**
     * Creates a new instance of TravelBean
     */
    public TravelBean() {
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
    
    
}
