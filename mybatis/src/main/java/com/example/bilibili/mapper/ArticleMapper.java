package com.example.bilibili.mapper;


import com.example.bilibili.emtity.Article;
import org.apache.ibatis.annotations.*;

//@Mapper
public interface ArticleMapper {

    @Select("select * from article where id=#{id}")
    public Article getArticleById(Integer id);

    @Delete("delete from article where id=#{id}")
    public int deleteArticleById(Integer id);

    @Options(useGeneratedKeys =  true,keyProperty = "id")
    @Insert("insert into article(title) values(#{title})")
    public int insertArticle(Article article);

    @Update("update article set title=#{articleTitle} where id=#{id}")
    public int updateArticle(Article article);

    public Article getArticleByTitle(String title);

    public void insertArticleContent(String content);

}
