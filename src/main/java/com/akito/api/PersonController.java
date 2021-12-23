package com.akito.api;

import com.akito.models.Person;
import com.akito.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/person")
@RestController
public class PersonController {
    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personServce) {
        this.personService = personServce;
    }
    @PostMapping
    public void addPerson(@RequestBody Person person) {
        personService.addPerson(person);
    }
    @GetMapping
    public List<Person> getAllPeople() {
        return  personService.getAllPeople();
    }
}
