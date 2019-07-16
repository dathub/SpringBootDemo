package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;

@Configuration
public class LoadDatabase {

    @Bean
    CommandLineRunner init(ChapterRepository repository){
        return args -> {
          Flux.just(
                  new Chapter("QSWJ"),
                  new Chapter("RWWSB"),
                  new Chapter("..more"))
                  .flatMap(repository::save)
                  .subscribe(System.out::println);
        };
    }
}
