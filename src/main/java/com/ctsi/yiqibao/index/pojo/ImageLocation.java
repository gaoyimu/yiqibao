package com.ctsi.yiqibao.index.pojo;

import lombok.Data;

import java.util.Date;

/**
 * 图片相关pojo对应数据库yqb_image_location
 */
@Data
public class ImageLocation {
    /**
     * 主键
     */
    private Integer id;
    /**
     *图片模式
     */
    private String mode;
    /**
     * 排序
     */
    private Integer sort;
    private String image_path;
    private String is_online;
    private String is_del;
    private String image_href;
    private String image_name;
    private String image_type;
    private Date create_date;
    private Date update_date;
    /**
     * 是否为手机端 1，是 0否
     */
    private Integer is_mobile;
}
