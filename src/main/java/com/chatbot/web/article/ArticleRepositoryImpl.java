package com.chatbot.web.article;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
interface ArticleRepository extends JpaRepository<Article,Long>,ArticleService{

}

interface ArticleService{
}
public class ArticleRepositoryImpl extends QuerydslRepositorySupport {
    ArticleRepositoryImpl(){
        super(Article.class);
    }
}
