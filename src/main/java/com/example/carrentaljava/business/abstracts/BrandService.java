package com.example.carrentaljava.business.abstracts;

import com.example.carrentaljava.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<Brand> getAll();
}
