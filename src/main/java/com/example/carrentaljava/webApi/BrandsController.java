package com.example.carrentaljava.webApi;

import com.example.carrentaljava.business.abstracts.BrandService;
import com.example.carrentaljava.business.requests.CreateBrandRequest;
import com.example.carrentaljava.business.responses.GetAllBrandsResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brands")
public class BrandsController {
    private final BrandService brandService;

    @Autowired
    public BrandsController(BrandService brandService) {
        this.brandService = brandService;
    }

    @GetMapping("getall")
    public List<GetAllBrandsResponse> getAll() {
        return brandService.getAll();
    }

    @PostMapping("create")
    public void create(@RequestBody  CreateBrandRequest createBrandRequest) {
        brandService.create(createBrandRequest);
    }
}
