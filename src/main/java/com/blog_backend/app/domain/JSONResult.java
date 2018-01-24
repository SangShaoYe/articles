package com.blog_backend.app.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by full on 2017/10/24.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JSONResult {

    private Integer code = 1000;
    private String msg = "success";
    private Object data;

    public JSONResult(Object data) {
        this.data = data;
    }

    public JSONResult(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
