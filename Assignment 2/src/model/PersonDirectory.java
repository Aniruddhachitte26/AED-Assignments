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

//    public Person searchPersonByName(String firstName) {
//        for (Person p : persons) {
//            if (p.getFirstName().equals(firstName) ) {
//                return p;
//            }
//        }
//        return null;
//    }
    public Person searchPersonByName(String firstName, String lastName, String hstreet) {
    for (Person p : persons) {
        boolean firstNameMatches = (firstName != null && !firstName.isBlank() && p.getFirstName().equalsIgnoreCase(firstName));
        boolean lastNameMatches = (lastName != null && !lastName.isBlank() && p.getLastName().equalsIgnoreCase(lastName));
        boolean hstreetMatches = (hstreet != null && !hstreet.isBlank() && p.getHstreet().equalsIgnoreCase(hstreet));

        if (firstNameMatches || lastNameMatches || hstreetMatches) {
            return p;
        }
    }
    return null;
}
}
