package com.evo.apatrios.service;

import com.evo.apatrios.model.Evaluation;
import com.evo.apatrios.model.QEvaluation;
import com.evo.apatrios.repository.EvaluationRepository;
import com.evo.apatrios.service.argument.CreateEvaluationArgument;
import com.evo.apatrios.service.argument.SearchEvaluationArgument;
import com.evo.apatrios.util.QPredicates;
import com.google.common.collect.Lists;
import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EvaluationServiceImpl implements EvaluationService {

    private final EvaluationRepository repository;

    private final QEvaluation qEvaluation = QEvaluation.evaluation1;

    @Override
    public List<Evaluation> getList(SearchEvaluationArgument argument) {
        Predicate predicate = buildPredicate(argument);

        return Lists.newArrayList(repository.findAll(predicate));

    }

    private Predicate buildPredicate(SearchEvaluationArgument argument) {
        return QPredicates.builder()
                          .add(argument.getContent(), qEvaluation.content::containsIgnoreCase)
                          .add(argument.getSource(), qEvaluation.source::containsIgnoreCase)
                          .add(argument.getEvaluation(), qEvaluation.evaluation::eq)
                          .buildAnd();
    }


    @Override
    public Evaluation create(CreateEvaluationArgument argument) {
        return repository.save(Evaluation.builder()
                                         .content(argument.getContent())
                                         .source(argument.getSource())
                                         .evaluation(argument.getEvaluation())
                                         .createDate(argument.getCreateDate())
                                         .build());
    }
}
