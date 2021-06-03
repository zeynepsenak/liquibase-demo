package com.example.liquibasedemo.controller;

import com.example.liquibasedemo.dbmodel.Person;
import com.example.liquibasedemo.repository.PersonRepository;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@ApiOperation(value = "api/person", tags = "Person Controller")
@RequiredArgsConstructor
@RestController
@RequestMapping("api/person")
public class Controller {

    private PersonRepository personRepository;

    @Autowired
    public Controller(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    @PostMapping()
    public String createPerson(@RequestBody Person personCreate){
        personRepository.save(personCreate);
        return "created";
    }

    @GetMapping
    public List<Person> getPerson(){
        return personRepository.findAll();
    }
}
