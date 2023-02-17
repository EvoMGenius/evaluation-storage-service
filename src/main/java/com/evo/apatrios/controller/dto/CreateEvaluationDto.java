package com.evo.apatrios.controller.dto;

import com.evo.apatrios.model.EvaluationValue;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class CreateEvaluationDto {

    @NotBlank
    private String content;

    @NotBlank
    private String source;

    @NotNull
    private EvaluationValue evaluation;

    private Date createDate;
}
