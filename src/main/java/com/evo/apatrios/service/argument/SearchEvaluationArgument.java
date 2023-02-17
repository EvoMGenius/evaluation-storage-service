package com.evo.apatrios.service.argument;

import com.evo.apatrios.model.EvaluationValue;
import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SearchEvaluationArgument {

    String content;

    String source;

    EvaluationValue evaluation;
}
