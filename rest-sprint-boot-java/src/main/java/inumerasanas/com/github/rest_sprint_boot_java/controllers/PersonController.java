package inumerasanas.com.github.rest_sprint_boot_java.controllers;


import inumerasanas.com.github.rest_sprint_boot_java.PersonServices;
import inumerasanas.com.github.rest_sprint_boot_java.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    //people
    @RequestMapping(
            method = RequestMethod.GET,
            produces = APPLICATION_JSON_VALUE
    )
    public List<Person> findAll(){
        return service.findAll();
    }


    //id
    @RequestMapping(value = "/{id}",
        method = RequestMethod.GET,
        produces = APPLICATION_JSON_VALUE
    )
    public Person findById(@PathVariable("id") String id){
        return service.findById(id);
    }

    //Post
    @RequestMapping(method = RequestMethod.POST,
        consumes = APPLICATION_JSON_VALUE,
        produces = APPLICATION_JSON_VALUE
    )
    public Person create(@RequestBody Person person){
        return service.create(person);
    }

    //Put
    @RequestMapping(method = RequestMethod.PUT,
            consumes = APPLICATION_JSON_VALUE,
            produces = APPLICATION_JSON_VALUE
    )
    public Person update(@RequestBody Person person){
        return service.update(person);
    }

    //Delete
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id){
        service.delete(id);

    }

}
