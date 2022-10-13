package com.example.appaws;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@SpringBootApplication
@RestController
public class AppAwsApplication {
@GetMapping("/")
public String home() {
return "SpringBoot Application deployed on AWS";
}
public static void main(String[] args) {
SpringApplication.run(AppAwsApplication.class, args);
}
}