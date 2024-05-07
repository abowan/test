package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository) {
        return args -> {
            Student mariam =new Student(
                    1L , "mariam" , "mariam@gmail.com", LocalDate.of(1997 , 9 , 16)
            );
            Student ali =new Student(
                         "ali" , "ali@gmail.com", LocalDate.of(1998 , 9 , 16)
            );
            Student mohamed=new Student(
                     "mohamed" , "mohamed@gmail.com", LocalDate.of(1999 , 9 , 17)
            );
            Student ibrahim=new Student(
                     "ibrahim" , "ibrahim@gmail.com", LocalDate.of(2000 , 9 , 19)
            );
            Student mokhtar=new Student(
                     "mokhtar" , "mokhtar@gmail.com", LocalDate.of(2001 , 9 , 26)
            );
            repository.saveAll(
                    List.of(mariam , ali , mohamed , ibrahim ,mokhtar)

            );
        };
    }
}
