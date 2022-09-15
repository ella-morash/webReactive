package com.example.webfluxmongo.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.time.LocalDate;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Document
public class Course {
    @Id
    private String id;
    private String name;
    private List<String> students;
    private boolean isClosed;
    @CreatedDate
    private LocalDate createdOn;
    @LastModifiedDate
    private LocalDate updatedOn;
}
