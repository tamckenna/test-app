package com.creoslate.poc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) { SpringApplication.run(Application.class, args); }

    @Override
    public void run(String... args) throws Exception {
        logger.info("Starting Application...");
    }

    public String getGreeting() { return "Hello world."; }
}
