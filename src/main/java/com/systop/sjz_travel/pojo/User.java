package com.systop.sjz_travel.pojo;

import lombok.Data;

@Data
public class User {
    Integer id;
    String name;
    String password;
    String mobile;
    String email;
    int sex;
    int age;

}
