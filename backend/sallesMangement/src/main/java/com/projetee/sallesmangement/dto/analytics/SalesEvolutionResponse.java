package com.projetee.sallesmangement.dto.analytics;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalesEvolutionResponse {
    private Double currentMonthRevenue;
    private Double previousMonthRevenue;
    private Double growthRate;
}