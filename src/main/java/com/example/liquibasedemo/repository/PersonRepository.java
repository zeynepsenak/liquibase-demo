package com.example.liquibasedemo.repository;

import com.example.liquibasedemo.dbmodel.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {

}
