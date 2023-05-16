package com.example.restservice;

import java.util.List;
import java.util.Optional;

public interface PersonRepository {
    List<Person> getAllPersons();
    List<Person> getPersonsFilter(Optional<String> name, Optional<String> email, Optional<Integer> age);
    Person getPerson(int id) throws PersonNotFoundEx;
    Person updatePerson(int personID, PersonDTO person) throws PersonNotFoundEx;
    boolean deletePerson(int id) throws PersonNotFoundEx;
    Person addPerson(Person person) throws BadRequestEx;
    Integer countPersons();

}
