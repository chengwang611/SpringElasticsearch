// src/test/java/com/example/elasticsearch/service/PersonServiceTest.java

package com.example.elasticsearch.service;

import com.example.elasticsearch.model.Person;
import com.example.elasticsearch.repository.PersonRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class PersonServiceTest {

    @Mock
    private PersonRepository personRepository;

    @InjectMocks
    private PersonService personService;

    private Person person;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        person = new Person();
        person.setId("1");
        person.setName("John Doe");
        person.setAge(30);
    }

    @Test
    void testSavePerson() {
        when(personRepository.save(person)).thenReturn(person);

        Person savedPerson = personService.savePerson(person);

        verify(personRepository, times(1)).save(person);
        assert savedPerson != null;
        assert savedPerson.getName().equals("John Doe");
    }
}
