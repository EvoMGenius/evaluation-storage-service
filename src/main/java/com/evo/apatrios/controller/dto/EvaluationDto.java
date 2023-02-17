package com.evo.apatrios.controller.dto;

import com.evo.apatrios.model.EvaluationValue;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Data
public class EvaluationDto {

    private UUID id;

    private String content;

    private String source;

    private EvaluationValue evaluation;

    private Date createDate;
}
