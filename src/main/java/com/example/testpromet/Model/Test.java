package com.example.testpromet.Model;

import jakarta.annotation.Nullable;
import lombok.Data;

@Data
public class Test {
    @Nullable
    private Long id;
    private String name;
    private String message;
}
