package com.pgs.workshop.model;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id @GeneratedValue
    private Long id;

    @Column
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
