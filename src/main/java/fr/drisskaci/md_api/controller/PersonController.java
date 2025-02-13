package fr.drisskaci.md_api.controller;

import fr.drisskaci.md_api.model.Person;
import fr.drisskaci.md_api.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @Autowired
    PersonRepository repository;

    @PostMapping("/addPerson")
    public void addPerson(@RequestBody Person person){
        repository.save(person);
    }
}
