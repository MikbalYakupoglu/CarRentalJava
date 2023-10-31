package com.example.carrentaljava.business.concretes;

import com.example.carrentaljava.business.abstracts.BrandService;
import com.example.carrentaljava.business.requests.CreateBrandRequest;
import com.example.carrentaljava.business.responses.GetAllBrandsResponse;
import com.example.carrentaljava.dataAccess.abstracts.BrandRepository;
import com.example.carrentaljava.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {
    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        var brands = brandRepository.findAll();
        var brandResponses = new ArrayList<GetAllBrandsResponse>();
        for (Brand brand : brands) {
            GetAllBrandsResponse brandResponse = new GetAllBrandsResponse();
            brandResponse.setId(brand.getId());
            brandResponse.setName(brand.getName());

            brandResponses.add(brandResponse);
        }
        return brandResponses;
    }

    public void create(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());

        brandRepository.save(brand);
    }
}
