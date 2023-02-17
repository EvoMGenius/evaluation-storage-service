package com.evo.apatrios.controller;

import com.evo.apatrios.controller.dto.CreateEvaluationDto;
import com.evo.apatrios.controller.dto.EvaluationDto;
import com.evo.apatrios.controller.dto.SearchEvaluationDto;
import com.evo.apatrios.model.Evaluation;
import com.evo.apatrios.service.EvaluationService;
import com.evo.apatrios.service.argument.CreateEvaluationArgument;
import com.evo.apatrios.service.argument.SearchEvaluationArgument;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

import static com.evo.apatrios.controller.mapper.EvaluationMapper.MAPPER;

@RestController
@RequestMapping("/api/statistics")
@RequiredArgsConstructor
public class EvaluationController {

    private final EvaluationService service;

    @GetMapping("/list")
    public List<EvaluationDto> getList(SearchEvaluationDto dto) {
        SearchEvaluationArgument argument = MAPPER.toSearchArgument(dto);

        return service.getList(argument).stream()
                      .map(MAPPER::toDto)
                      .collect(Collectors.toList());
    }

    @PostMapping("/create")
    public EvaluationDto create(@RequestBody @Valid CreateEvaluationDto dto) {
        CreateEvaluationArgument argument = MAPPER.toCreateArgument(dto);
        System.out.println(argument.getCreateDate());
        Evaluation evaluation = service.create(argument);
        System.out.println(evaluation.getCreateDate());
        return MAPPER.toDto(evaluation);
    }
}
