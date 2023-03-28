package com.reactive.domain;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@Document
public class Movie {
    private String id;

    @NonNull
    private String title;
}
