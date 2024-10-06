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
    private int ssn;
    private int age;
    private String hstreet;
    private String hcity;
    private String hstate;
    private int hzipCode;
    private int hunitNumber;
    private long hphoneNumber;
    private String wstreet;
    private String wcity;
    private String wstate;
    private int wzipCode;
    private int wunitNumber;
    private long wphoneNumber;
    private double monthlysalary;

    public double getMonthlysalary() {
        return monthlysalary;
    }

    public void setMonthlysalary(double monthlysalary) {
        this.monthlysalary = monthlysalary;
    }

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

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

    public long getHphoneNumber() {
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

    public long getWphoneNumber() {
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
    public String toString() {
        return firstName;
    }

}
