package com.blog_backend.app.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

/**
 * Created by full on 2017/10/28.
 */
@Data
public class Parameters {

    @NotEmpty(message = "接口名不能为空")
    private String interfaceName;
    private String name;
    private String idCard;
    private String bankCard;
    private String mobile;
    private String remarks;
    private String token;
    private String vin;
    private String plate; // 车牌号
    private String engine;
    private String type;

    private Integer[] ids;
    private String loginToken;
    private Double price; // 价格
    private String reportName; // 报告名-唯一
    private Integer superId; // 父Id
    private Integer id; // 主要id
    private Boolean bool;
    private Integer size;
    private Integer page;
}