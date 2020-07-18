package com.example.client;

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
    public String getProductsBybBarcode(Long code) {
        return client.retrieve(HttpRequest.GET("api/v0/product/" + code)).firstElement().blockingGet();
    }
}
