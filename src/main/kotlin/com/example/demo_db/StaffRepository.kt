package com.example.demo_db

import org.springframework.data.jpa.repository.JpaRepository

interface StaffRepository: JpaRepository<StaffEntity, String>