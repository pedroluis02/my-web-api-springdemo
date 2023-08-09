package com.github.pedroluis02.webapidemo.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tag {
    public Tag(String name) {
        this.name = name;
    }

    private int id = -1;
    private String name;
}
