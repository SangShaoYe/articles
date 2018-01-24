package com.blog_backend.app.dao;

import com.blog_backend.app.dao.entity.Article;
import com.blog_backend.app.dao.entity.User;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by full on 2017/10/24.
 */
public interface ArticleRepository extends PagingAndSortingRepository<Article,Long>,JpaSpecificationExecutor {

}