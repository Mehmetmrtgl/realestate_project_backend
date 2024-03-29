package com.example.demo.responses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PropertyResponse {
    private Long id;
    private String propertyOwnerName;
    private String location;
    private String description;
    private Integer numberOfRooms;
    private String propertyType;
    private String status;
    private Long price;
    private FeatureResponse feature;
    private ClientResponse client;
    private List<String> images;
}