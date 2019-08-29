package com.example.demo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import me.guozi.ExampleService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}

@Component
@RequiredArgsConstructor
@Slf4j
class Example implements CommandLineRunner {

    private final ExampleService exampleService;

    @Override
    public void run(String... args) {
        log.info("Msg after warp: {}", exampleService.wrap("ok"));
    }
}
