package com.systop.sjz_travel.pojo;

public class picture {
    private  String id;
    private  String p_picture;
    private  String p_name;
    private  String p_introduction;
    private  String p_price;
    private  String p_gl;
    private String p_pl;
    private  String city;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getP_picture() {
        return p_picture;
    }

    public void setP_picture(String p_picture) {
        this.p_picture = p_picture;
    }

    public String getP_name() {
        return p_name;
    }

    public void setP_name(String p_name) {
        this.p_name = p_name;
    }

    public String getP_introduction() {
        return p_introduction;
    }

    public void setP_introduction(String p_introduction) {
        this.p_introduction = p_introduction;
    }

    public String getP_price() {
        return p_price;
    }

    public void setP_price(String p_price) {
        this.p_price = p_price;
    }

    public String getP_gl() {
        return p_gl;
    }

    public void setP_gl(String p_gl) {
        this.p_gl = p_gl;
    }

    public String getP_pl() {
        return p_pl;
    }

    public void setP_pl(String p_pl) {
        this.p_pl = p_pl;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "picture{" +
                "id='" + id + '\'' +
                ", p_picture='" + p_picture + '\'' +
                ", p_name='" + p_name + '\'' +
                ", p_introduction='" + p_introduction + '\'' +
                ", p_price='" + p_price + '\'' +
                ", p_gl='" + p_gl + '\'' +
                ", p_pl='" + p_pl + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
