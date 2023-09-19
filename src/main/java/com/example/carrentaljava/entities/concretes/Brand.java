package com.example.carrentaljava.entities.concretes;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Brand {
    private int id;
    private String name;

    public Brand(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
