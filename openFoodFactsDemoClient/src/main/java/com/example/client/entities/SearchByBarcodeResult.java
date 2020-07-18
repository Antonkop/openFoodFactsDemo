package com.example.client.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SearchByBarcodeResult {

    private Long code;
    private Product product;
    @JsonProperty("status_verbose")
    private String statusVerbose;
    @JsonProperty("status")
    private Integer status;

}
