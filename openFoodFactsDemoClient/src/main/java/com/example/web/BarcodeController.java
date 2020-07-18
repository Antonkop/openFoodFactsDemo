package com.example.web;

import com.example.client.OpenFoodClient;
import com.example.client.entities.SearchByBarcodeResult;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

import javax.inject.Inject;

@Controller("/barcode")
public class BarcodeController {

    @Inject
    private OpenFoodClient foodClient;

    @Get("/{barcode}")
    public HttpResponse<SearchByBarcodeResult> getProductsByBarcode(@PathVariable String barcode) {
        var result = foodClient.getProductByBarcode(Long.parseLong(barcode));
        return HttpResponse.created(result);
    }

}
