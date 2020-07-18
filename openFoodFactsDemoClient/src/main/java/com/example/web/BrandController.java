package com.example.web;

import com.example.client.OpenFoodClient;
import com.example.client.entities.SearchByBrandResult;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Inject;

@Controller("/brand")
public class BrandController {

    @Inject
    private OpenFoodClient foodClient;

    @Get("/{brandName}")
    public HttpResponse<SearchByBrandResult> getProductsByBarcode(@PathVariable String brandName) {
        var result = foodClient.getProductsByBrand(brandName);
        return HttpResponse.created(result);
    }
}
