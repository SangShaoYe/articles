package com.blog_backend.app.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by full on 2017/10/24.
 */
//@Entity
//@Table(name = "T_USER_INFO")
@Data
public class User implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USR_ID")
    private Integer userId;

    @Column(name = "SUPER_ID")
    private Integer superId;

    @Column(name = "USR_NAME")
    private String userName;

    @Column(name = "REAL_NAME")
    private String realName;

    @Column(name = "USR_PWD")
    private String userPassword;

    @Column(name = "USR_ROLE")
    private String userRole;

    @Column(name = "USR_INTEGRAL")
    private Double userIntegral;

    @Column(name = "USR_MOBILE")
    private String userMobile;
    @Column(name = "USR_PHONE")
    private String userPhone;
    @Column(name = "USR_EMAIL")
    private String userEmail;
    @Column(name = "USR_COMPANY")
    private String userCompany;
    @Column(name = "USR_DEPARTMENT")
    private String userDepartment;

    @Column(name = "HEAD_PORTRAIT")
    private String headPortrait;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "IS_DELETE")
    private Integer isDelete = 0;

    @Column(name = "COMPANY_KEY")
    private String companyKey;
    @Column(name = "COMPANY_CODE")
    private String companyCode;
    @Column(name = "COMPANY_NATURE")
    private String companyNature;

    @Column(name = "CPY_CODE")
    private String cpyCode;
    @Column(name = "REGISTER_DATE")
    private Date registerDate;
    @Column(name = "CERTIFICATION_ID")
    private Integer certificationId;

    @Column(name = "EDITION_ID")
    private Integer editionId;

    /**
     * 设备分类：MOBILE-移动端
     */
    @Column(name = "DEVICE")
    private String device;

    /**
     * app用户登录标识
     */
    @Column(name = "LOGIN_TOKEN")
    private String loginToken;
}

