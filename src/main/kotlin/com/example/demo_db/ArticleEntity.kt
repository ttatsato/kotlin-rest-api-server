package com.example.demo_db

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "article")
class ArticleEntity {
    @Id
    @Column(name = "article_id")
    var articleId :Int = 0
    @Column
    var title = String()
    var content = String()
}

