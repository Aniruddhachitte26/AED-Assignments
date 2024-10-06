/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Aniruddha
 */
public class PersonDirectory {
    
    private ArrayList<Person> persons;

    public PersonDirectory() {
        this.persons = new ArrayList<Person>();
    }

    // Get list of all persons
    public ArrayList<Person> getPersons() {
        return persons;
    }

    // Set a new list of persons
    public void setPersons(ArrayList<Person> persons) {
        this.persons = persons;
    }

    // Add a new person to the directory
    public Person addPerson() {
        Person p = new Person();
        persons.add(p);
        return p;
    }

    // Delete a person from the directory
    public void deletePerson(Person person) {
        persons.remove(person);
    }

    // Search for a person by their SSN (or other unique identifier)
//    public Person searchPersonBySSN(String ssn) {
//        for (Person p : persons) {
//            if (p.getSsn().equals(ssn)) {
//                return p;
//            }
//        }
//        return null;
//    }

    // Search for a person by their full name (optional, depending on use case)
    public Person searchPersonByName(String firstName, String lastName) {
        for (Person p : persons) {
            if (p.getFirstName().equals(firstName) && p.getLastName().equals(lastName)) {
                return p;
            }
        }
        return null;
    }
}

