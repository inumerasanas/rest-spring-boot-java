package inumerasanas.com.github.rest_sprint_boot_java;

import inumerasanas.com.github.rest_sprint_boot_java.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding one Person!");

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Poliana");
        person.setLastName("Oliveira");
        person.setAddress("Algum lugar por ai - Bahia - Brasil");
        person.setGender("Feminino");
        return person;

    }

}
