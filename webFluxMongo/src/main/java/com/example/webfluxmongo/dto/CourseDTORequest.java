package com.example.webfluxmongo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CourseDTORequest {
    private String name;
    private List<String> students;
    private boolean isClosed;

}
