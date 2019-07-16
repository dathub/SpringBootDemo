package com.example.demo;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository
        extends ReactiveCrudRepository<Chapter, String> {


}
