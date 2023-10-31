package com.example.carrentaljava.business.abstracts;

import com.example.carrentaljava.business.requests.CreateBrandRequest;
import com.example.carrentaljava.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    public void create(CreateBrandRequest createBrandRequest);
}
