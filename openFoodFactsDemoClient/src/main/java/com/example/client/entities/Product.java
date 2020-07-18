package com.example.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Collection;

@Data
public class Product {
    private String id;
    @JsonProperty("product_name")
    private String name;
    @JsonProperty("_keywords")
    private Collection<String> keywords;
    @JsonProperty("image_url")
    private String imageUrl;
    @JsonProperty("image_nutrition_url")
    private String imageNutritionUrl;
    @JsonProperty("brands")
    private String brand;
    private Nutriments nutriments;
}
