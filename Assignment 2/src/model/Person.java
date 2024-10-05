/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aniruddha
 */
public class Person {

    private String firstName;
    private String lastName;
    private String hstreet;
    private String hcity;
    private String hstate;
    private int hzipCode;
    private int hunitNumber;
    private int hphoneNumber;
    private String wstreet;
    private String wcity;
    private String wstate;
    private int wzipCode;
    private int wunitNumber;
    private int wphoneNumber;

//    public Person(String firstName, String lastName, String hstreet, String hcity, String hstate, int hzipCode, int hunitNumber, int hphoneNumber, String wstreet, String wcity, String wstate, int wzipCode, int wunitNumber, int wphoneNumber) {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.hstreet = hstreet;
//        this.hcity = hcity;
//        this.hstate = hstate;
//        this.hzipCode = hzipCode;
//        this.hunitNumber = hunitNumber;
//        this.hphoneNumber = hphoneNumber;
//        this.wstreet = wstreet;
//        this.wcity = wcity;
//        this.wstate = wstate;
//        this.wzipCode = wzipCode;
//        this.wunitNumber = wunitNumber;
//        this.wphoneNumber = wphoneNumber;

//    }

    public String getHstreet() {
        return hstreet;
    }

    public void setHstreet(String hstreet) {
        this.hstreet = hstreet;
    }

    public String getHcity() {
        return hcity;
    }

    public void setHcity(String hcity) {
        this.hcity = hcity;
    }

    public String getHstate() {
        return hstate;
    }

    public void setHstate(String hstate) {
        this.hstate = hstate;
    }

    public int getHzipCode() {
        return hzipCode;
    }

    public void setHzipCode(int hzipCode) {
        this.hzipCode = hzipCode;
    }

    public int getHunitNumber() {
        return hunitNumber;
    }

    public void setHunitNumber(int hunitNumber) {
        this.hunitNumber = hunitNumber;
    }

    public int getHphoneNumber() {
        return hphoneNumber;
    }

    public void setHphoneNumber(int hphoneNumber) {
        this.hphoneNumber = hphoneNumber;
    }

    public String getWstreet() {
        return wstreet;
    }

    public void setWstreet(String wstreet) {
        this.wstreet = wstreet;
    }

    public String getWcity() {
        return wcity;
    }

    public void setWcity(String wcity) {
        this.wcity = wcity;
    }

    public String getWstate() {
        return wstate;
    }

    public void setWstate(String wstate) {
        this.wstate = wstate;
    }

    public int getWzipCode() {
        return wzipCode;
    }

    public void setWzipCode(int wzipCode) {
        this.wzipCode = wzipCode;
    }

    public int getWunitNumber() {
        return wunitNumber;
    }

    public void setWunitNumber(int wunitNumber) {
        this.wunitNumber = wunitNumber;
    }

    public int getWphoneNumber() {
        return wphoneNumber;
    }

    public void setWphoneNumber(int wphoneNumber) {
        this.wphoneNumber = wphoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    @Override
    public String toString(){
        return firstName;
    }

}
