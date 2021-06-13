package com.example;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import java.time.LocalDateTime;

@Entity
public class Sample extends PanacheEntity{

    public Long id;
    public String name;
    public String description;
    public LocalDateTime created_date;
    public LocalDateTime updated_date;

    //public String toString(){ return "ID: "+id+"\nname: "+name; }
}