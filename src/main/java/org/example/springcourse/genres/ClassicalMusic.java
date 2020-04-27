package org.example.springcourse.genres;

import org.example.springcourse.Music;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author Neil Alishev
 */
public class ClassicalMusic implements Music {
    @PostConstruct
    public void doMyInit(){
        System.out.println("initialization");
    }
    @PreDestroy
    public void doMyDestroy(){
        System.out.println("destroy");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
