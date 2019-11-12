package com.example.demo_db

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping
class ArticleController (var articleRepository: ArticleRepository) {

    @GetMapping("/")
    fun index () :List<ArticleEntity> {return articleRepository.findAll()}

    @GetMapping("/{id}")
    fun article (@PathVariable("id") id: Int) :ArticleEntity {
        var articles = articleRepository.findById(id)
        return articles.get()
    }
}