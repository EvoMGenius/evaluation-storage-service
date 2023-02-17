package com.evo.apatrios.repository;

import com.evo.apatrios.model.Evaluation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import java.util.UUID;

public interface EvaluationRepository extends JpaRepository<Evaluation, UUID>, QuerydslPredicateExecutor<Evaluation> {
}
