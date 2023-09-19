package com.example.carrentaljava.dataAccess.concretes;

import com.example.carrentaljava.dataAccess.abstracts.BrandRepository;
import com.example.carrentaljava.entities.concretes.Brand;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryBrandRepository implements BrandRepository {
    List<Brand> brands;

    public InMemoryBrandRepository() {
        this.brands = new ArrayList<Brand>();
        brands.add(new Brand(1, "BMW"));
        brands.add(new Brand(2, "Tofaşk"));
        brands.add(new Brand(3, "Merso"));
        brands.add(new Brand(4, "Reno"));
        brands.add(new Brand(5, "Fiat"));
    }

    @Override
    public List<Brand> getAll() {
        return brands;
    }
}
