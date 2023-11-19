//package com.example.demo.student;
//import java.time.LocalDate;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class StudentConfig {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository repository){ //θα τρεχει στο αποθετηριο
//        return args ->{
//            Student student =new Student("maria","maria.com",LocalDate.of(1970,05,05),20);
//            repository.save(student);
//
//            Student student2 =new Student("giannhs","giannhs.com",LocalDate.of(1950,05,05),20);
//            repository.save(student);
//
//            Student student3 =new Student("xristina","xristina.com",LocalDate.of(1998,05,05),20);
//            repository.save(student);
//
//        };
//    }
//}
