package com.codecool.corsdemo.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(fluent = false, chain = true)
public class TodoEntryDto {
    private String title;
    private String description;
}
