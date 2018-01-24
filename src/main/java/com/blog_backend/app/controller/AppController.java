package com.blog_backend.app.controller;

import com.blog_backend.app.domain.JSONResult;
import com.blog_backend.app.domain.Parameters;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * Created by full on 2017/10/24.
 */
@Slf4j
@RestController
@RequestMapping
public class AppController {

    @Value("${app.version}")
    String version;

    public int getVersion() {
        return Integer.valueOf(version).intValue();
    }

    @GetMapping
    public JSONResult index() {
        return new JSONResult("青岛诚为信征信有限公司98app");
    }

}
