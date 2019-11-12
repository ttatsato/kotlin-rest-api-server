package com.example.demo_db

import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("admin")
class AdminController (var articleRepository: ArticleRepository){

    @GetMapping()
    fun index (model: Model) :String {
        var articles :List<ArticleEntity> = articleRepository.findAll()
        model.addAttribute("articles", articles)
        return "admin/index"
    }
}