package com.evo.apatrios.service.argument;

import com.evo.apatrios.model.EvaluationValue;
import lombok.Builder;
import lombok.Value;

import java.util.Date;

@Value
@Builder
public class CreateEvaluationArgument {
    String content;

    String source;

    EvaluationValue evaluation;

    Date createDate;
}
