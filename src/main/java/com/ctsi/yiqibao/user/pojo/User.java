package com.ctsi.yiqibao.user.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 用户相关po对应yqb_user
 */
@Data
public class User {
    private String id;
    private String open_id;
    private String gender;
    private String nick_name;
    private String image_url;
    private String country;
    private String province;
    private String city;
    private String language;
    private String encryptedData;
    private String qx;
    private String iv;
    private String signature;
    private Date nowTime = new Date();

}
