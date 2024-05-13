package com.JUnit.JUnit.repo;

import com.JUnit.JUnit.entities.Person;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class PersonRepoTest {

    @Autowired
    private PersonRepo personRepo;
    @Test
    void isPersonExistsById() {
        Person person=new Person(123,"abc","abcd");
        personRepo.save(person);

       Boolean actualResult= personRepo.isPersonExistsById(123);

       assertThat(actualResult).isTrue();
    }

    @AfterEach
    void tearDown()
    {
        System.out.println("tear down");
        personRepo.deleteAll();
    }

    @BeforeEach
    void setUp()
    {
        System.out.println("set up");
    }
}