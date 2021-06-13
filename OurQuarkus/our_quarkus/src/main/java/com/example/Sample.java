package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.time.LocalDateTime;

@Entity
public class Sample extends PanacheEntity{

    private Long id;
    private String name;
    private String description;
    private LocalDateTime created_date;
    private LocalDateTime updated_date;

    //public String toString(){ return "ID: "+id+"\nname: "+name; }
}