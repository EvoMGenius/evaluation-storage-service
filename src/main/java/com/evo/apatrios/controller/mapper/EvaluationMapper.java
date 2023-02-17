package com.evo.apatrios.controller.mapper;

import com.evo.apatrios.controller.dto.CreateEvaluationDto;
import com.evo.apatrios.controller.dto.EvaluationDto;
import com.evo.apatrios.controller.dto.SearchEvaluationDto;
import com.evo.apatrios.model.Evaluation;
import com.evo.apatrios.service.argument.CreateEvaluationArgument;
import com.evo.apatrios.service.argument.SearchEvaluationArgument;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EvaluationMapper {
    EvaluationMapper MAPPER = Mappers.getMapper(EvaluationMapper.class);

    SearchEvaluationArgument toSearchArgument(SearchEvaluationDto dto);

    CreateEvaluationArgument toCreateArgument(CreateEvaluationDto dto);

    EvaluationDto toDto(Evaluation evaluation);
}
