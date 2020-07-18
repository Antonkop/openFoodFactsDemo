package com.example.client;

import com.example.client.entities.SearchByBarcodeResult;
import com.example.client.entities.SearchByBrandResult;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;

import javax.inject.Inject;
import javax.inject.Singleton;

@Singleton
public class OpenFoodClientImpl implements OpenFoodClient {

    @Inject
    @Client("${open.food.api.url}")
    RxHttpClient client;

    @Override
    public SearchByBarcodeResult getProductByBarcode(Long code) {
        return client.retrieve(HttpRequest.GET("api/v0/product/" + code), SearchByBarcodeResult.class)
                .firstElement()
                .blockingGet();
    }

    //TODO IMPLEMENT PAGINATION
    @Override
    public SearchByBrandResult getProductsByBrand(String brand) {
        return client.retrieve(HttpRequest.GET("cgi/search.pl?action=process&json=true&brands=" + brand), SearchByBrandResult.class)
                .firstElement()
                .blockingGet();
    }
}
