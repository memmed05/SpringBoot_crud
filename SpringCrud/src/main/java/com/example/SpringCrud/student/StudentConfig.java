package com.example.SpringCrud.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.*;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student memmed = new Student(
                    "Memmed",
                    "memmedh@mail.ru",
                    LocalDate.of(2001, AUGUST, 9)
            );
            Student firat = new Student(
                    "Firat",
                    "firats@gmail.com",
                    LocalDate.of(2001, MARCH, 8)
            );
            Student elvin = new Student(
                    "Elvin",
                    "elvinv@gmail.com",
                    LocalDate.of(2001, JANUARY, 1)
            );
            repository.saveAll(
                    List.of(memmed, firat, elvin)
            );
        };
    }
}
