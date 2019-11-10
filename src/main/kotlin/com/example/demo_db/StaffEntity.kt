package com.example.demo_db

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "Staff")
class StaffEntity {
    @Id
    var id :Int = 0
    @Column
    var name = String()
}

