package com.blog_backend.app.dao.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by full on 2017/10/24.
 */
@Entity
@Table(name = "article")
@Data
public class Article implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pk_id")
    private Long id;

    @Column(name = "author")
    private String author;

    @Column(name = "create_time")
    @JsonFormat(pattern = "yyy-MM-dd hh:mm:ss",timezone = "GMT+8")
    private java.sql.Timestamp createTime;

    @Column(name = "abstract")
    private String abstract0;

    @Column(name = "subject")
    private String subject;

    @Column(name = "content")
    private String content;

}

