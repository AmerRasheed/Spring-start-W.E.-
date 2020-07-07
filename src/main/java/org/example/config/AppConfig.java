package org.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration                                       // It creates configuration Class
@ComponentScan  (basePackages = "org.example" )      // it should scan for COMPONENTs and when it finds the components, IT CREATES A BEAN
                                                      // IMPORTANT must declare package with ComponentScan


public class AppConfig {                          //Defining our own Scanner beans as follows


    @Bean                                       //Annotation as Bean
    public Scanner scanner(){
        return new Scanner(System.in);         // This method will return a Scanner and print it as well
    }
}
