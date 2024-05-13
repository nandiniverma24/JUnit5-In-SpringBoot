package com.JUnit.JUnit.services;

import com.JUnit.JUnit.entities.Person;
import com.JUnit.JUnit.repo.PersonRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private PersonRepo repo;

    public List<Person> getAllPerson(){
        return this.repo.findAll();
    }

    public PersonService(PersonRepo repo) {
        this.repo = repo;
    }
}
