package com.example.demo_db

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api")
class ArticleController (var articleRepository: ArticleRepository) {

    @GetMapping("/")
    fun index () :List<ArticleEntity> = articleRepository.findAll()

    @GetMapping("/{id}")
    fun article (@PathVariable("id") id: Int) :ArticleEntity =  articleRepository.findById(id).get()
}