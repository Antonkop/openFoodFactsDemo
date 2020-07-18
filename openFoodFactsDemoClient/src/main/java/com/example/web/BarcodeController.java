package com.example.web;

import com.example.client.OpenFoodClient;
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
    public HttpResponse<String> getProductsByBarcode(@PathVariable String barcode) {
        var result = foodClient.getProductsBybBarcode(Long.parseLong(barcode));
        return HttpResponse.created(result);
    }

}
