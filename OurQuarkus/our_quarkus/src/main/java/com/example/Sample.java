package com.example;

import io.quarkus.hibernate.reactive.panache.PanacheEntityBase;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import java.time.LocalDateTime;

@Entity
public class Sample extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    public String name;
    public String description;
    public LocalDateTime created_date;
    public LocalDateTime updated_date;

    //public String toString(){ return "ID: "+id+"\nname: "+name; }
}