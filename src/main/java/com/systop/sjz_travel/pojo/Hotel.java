package com.systop.sjz_travel.pojo;

public class Hotel {
    private  String id;
    private  String img;
    private  String name;
    private  String price;
    private  String miaoshu;
    private  int bed;
    private  int day;
    private  int star;
    private  String startdate;
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMiaoshu() {
        return miaoshu;
    }

    public void setMiaoshu(String miaoshu) {
        this.miaoshu = miaoshu;
    }

    public int getBed() {
        return bed;
    }

    public void setBed(Integer bed) {
        this.bed = bed;
    }

    public int getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public int getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public String getStartdate() {
        return startdate;
    }

    public void setStartdate(String startdate) {
        this.startdate = startdate;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }
}
