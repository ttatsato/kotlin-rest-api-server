package com.example.demo_db

import org.springframework.data.jpa.repository.JpaRepository

interface ArticleRepository: JpaRepository<ArticleEntity, String>
