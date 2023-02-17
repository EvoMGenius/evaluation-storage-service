package com.evo.apatrios.service;

import com.evo.apatrios.model.Evaluation;
import com.evo.apatrios.service.argument.CreateEvaluationArgument;
import com.evo.apatrios.service.argument.SearchEvaluationArgument;

import java.util.List;

public interface EvaluationService {
    List<Evaluation> getList(SearchEvaluationArgument argument);

    Evaluation create(CreateEvaluationArgument argument);
}
