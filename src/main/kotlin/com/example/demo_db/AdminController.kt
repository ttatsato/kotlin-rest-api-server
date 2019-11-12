package com.example.demo_db

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping

@Controller
@RequestMapping("admin")
class AdminController (var articleRepository: ArticleRepository){

    @GetMapping()
    fun index (model: Model) :String {
        var articles :List<ArticleEntity> = articleRepository.findAll()
        model.addAttribute("articles", articles)
        return "admin/index"
    }

    @GetMapping("/edit/{id}")
    fun index (@PathVariable("id") id:Int, model: Model) :String {
        model.addAttribute("article", articleRepository.findById(id).get())
        return "admin/edit"
    }
}