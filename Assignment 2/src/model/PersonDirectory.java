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
    private ArrayList<Person> person;
    
    public PersonDirectory(){
        this.person = new ArrayList<Person>();
    }
    
    public ArrayList<Person>getPerson(){
        return person;
    }
    
    public void setAccounts(ArrayList<Person> person){
        this.person =person;
    }
    
    public Person addPerson(){
        Person a = new Person();
        person.add(a);
        return a;
    }
    
//    public void deleteAccount(Person person){
//        Person.remove(person);
//    }
//    public Account searchAccount(String accountNumber){
//    
//        for (Account a: accounts){
//        
//            if (a.getAccountNumber().contains(accountNumber)){
//                return a;
//            }
//        }
//        return null;
//    }
}
