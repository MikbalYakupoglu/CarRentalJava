package com.example.carrentaljava.dataAccess.abstracts;

import com.example.carrentaljava.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrandRepository extends JpaRepository<Brand, Integer> {

}
