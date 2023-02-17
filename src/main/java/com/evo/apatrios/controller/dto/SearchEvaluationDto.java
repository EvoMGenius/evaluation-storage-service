package com.evo.apatrios.controller.dto;

import com.evo.apatrios.model.EvaluationValue;
import lombok.Data;

@Data
public class SearchEvaluationDto {
    private String content;

    private String source;

    private EvaluationValue evaluation;
}
