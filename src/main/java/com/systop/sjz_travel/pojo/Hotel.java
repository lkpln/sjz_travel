package com.systop.sjz_travel.pojo;


import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 功能描述: <br>
 * @Info: 实体类
 * @Return:
 * @Author: 李航飞
 * @Date: 2020/7/30 10:37
 */

@Entity
@Table(name="hotel")
public class Hotel implements Serializable {
    @javax.persistence.Id
    @Id
    private  String id;

    private  String img;
    private  String name;
    private  Double price;
    private  String miaoshu;
    private  Integer bed;
    private  Integer day;
    private  Integer star;
    private  java.util.Date startdate;
    private  String addr;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public Integer getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
        this.bed = bed;
    }

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public java.util.Date getStartdate() {
        return startdate;
    }

    public void setStartdate(java.util.Date startdate) {
        this.startdate = startdate;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
