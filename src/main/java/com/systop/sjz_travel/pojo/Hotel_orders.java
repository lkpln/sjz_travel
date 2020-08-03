package com.systop.sjz_travel.pojo;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "hotel_orders")
public class Hotel_orders implements Serializable {
    @javax.persistence.Id
    @Id
    private  String id;
    private  String scenicid;
    private  String userid;
    private  Integer qty;
    private  BigDecimal payment;
    private  String status;
    private  java.util.Date paytime;
    private  String phone;
    private  String username;
    private  String scenicname;
    private  String begin;
    private  String end;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getScenicid() {
        return scenicid;
    }

    public void setScenicid(String scenicid) {
        this.scenicid = scenicid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public BigDecimal getPayment() {
        return payment;
    }

    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public java.util.Date getPaytime() {
        return paytime;
    }

    public void setPaytime(java.util.Date paytime) {
        this.paytime = paytime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getScenicname() {
        return scenicname;
    }

    public void setScenicname(String scenicname) {
        this.scenicname = scenicname;
    }

    public String getBegin() {
        return begin;
    }

    public void setBegin(String begin) {
        this.begin = begin;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }
    @Override
    public String toString() {
        return "Hotel_orders{" +
                "id='" + id + '\'' +
                ", scenicid='" + scenicid + '\'' +
                ", userid='" + userid + '\'' +
                ", qty=" + qty +
                ", payment=" + payment +
                ", status='" + status + '\'' +
                ", paytime=" + paytime +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                ", scenicname='" + scenicname + '\'' +
                ", begin='" + begin + '\'' +
                ", end='" + end + '\'' +
                '}';
    }
}
