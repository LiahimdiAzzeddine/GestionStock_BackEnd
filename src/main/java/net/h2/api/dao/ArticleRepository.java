package net.h2.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import net.h2.api.model.Article;


public interface ArticleRepository extends JpaRepository<Article,Integer>{

}
