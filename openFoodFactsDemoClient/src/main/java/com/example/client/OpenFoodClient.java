package com.example.client;

import com.example.client.entities.SearchByBarcodeResult;
import com.example.client.entities.SearchByBrandResult;

public interface OpenFoodClient {
    SearchByBarcodeResult getProductByBarcode(Long code);
    SearchByBrandResult getProductsByBrand(String brand);
}
