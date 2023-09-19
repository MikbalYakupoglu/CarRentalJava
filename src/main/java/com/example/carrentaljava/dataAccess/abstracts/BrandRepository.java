package com.example.carrentaljava.dataAccess.abstracts;

import com.example.carrentaljava.entities.concretes.Brand;

import java.util.List;

public interface BrandRepository {
    List<Brand> getAll();
}
