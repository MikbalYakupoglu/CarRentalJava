package com.example.carrentaljava.business.concretes;

import com.example.carrentaljava.business.abstracts.BrandService;
import com.example.carrentaljava.dataAccess.abstracts.BrandRepository;
import com.example.carrentaljava.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.getAll();
    }
}
