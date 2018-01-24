package com.blog_backend.app.api;

import com.annotation.Authentication;
import com.blog_backend.app.dao.ArticleRepository;
import com.blog_backend.app.dao.entity.Article;
import com.blog_backend.app.domain.JSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.*;
import javax.servlet.http.HttpSession;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.List;

@RestController
@RequestMapping("/article")
public class ArticleController {

    @Autowired
    private ArticleRepository repository;

    @GetMapping("/{id}")
    public JSONResult one(
            @Digits(message = "必须是数字", integer = 10, fraction = 0)
            @NotNull @PathVariable("id") Long id) {

        return new JSONResult(repository.findOne(id));
    }


    @PostMapping
    @Authentication(Authentication.TYPE.LOGIN)
    public JSONResult create(@NotNull Article article,String password) {
        if ("111111".equals(password)) {
            return new JSONResult(2000, "发布签名错误");
        }
        article.setCreateTime(Timestamp.from(Instant.now()));
        repository.save(article);
        return new JSONResult(article.getId());
    }

    @PostMapping("/list")
    public JSONResult list(@Digits(message = "必须是数字", integer = 10, fraction = 0)
                               @NotNull Integer page) {
        PageRequest pr = new PageRequest(page - 1, 10);
        return new JSONResult(repository.findAll(pr));
    }
}
