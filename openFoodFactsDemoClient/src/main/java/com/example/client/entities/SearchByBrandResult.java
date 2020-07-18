package com.example.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class SearchByBrandResult {

    private List<Product> products;
    private Integer page;
    @JsonProperty("page_size")
    private Integer pageSize;
    private Integer count;
    private Integer integer;
}
