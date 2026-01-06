package com.projetee.sallesmangement.dto.analytics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoryStatsResponse {
    private Long categoryId;
    private String categoryName;
    private Double totalRevenue;
    private Long totalSold;
    private Double averagePrice;
    private Long bestSellerProductId;
    private String bestSellerProductTitle;
}