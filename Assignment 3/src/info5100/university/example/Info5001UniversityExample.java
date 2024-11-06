/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package info5100.university.example;

import info5100.university.example.CourseCatalog.Course;
import info5100.university.example.CourseCatalog.CourseCatalog;
import info5100.university.example.CourseSchedule.CourseLoad;
import info5100.university.example.CourseSchedule.CourseOffer;
import info5100.university.example.CourseSchedule.CourseSchedule;
import info5100.university.example.Department.Department;
import info5100.university.example.Persona.Faculty.FacultyDirectory;
import info5100.university.example.Persona.Faculty.FacultyProfile;
import info5100.university.example.Persona.Person;
import info5100.university.example.Persona.PersonDirectory;
import info5100.university.example.Persona.StudentDirectory;
import info5100.university.example.CourseSchedule.SeatAssignment;
import info5100.university.example.Persona.StudentProfile;

/**
 *
 * @author kal bugrara
 */
public class Info5001UniversityExample {

    /**
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        Department department = new Department("Information Systems"); // one department
        PersonDirectory pd = department.getPersonDirectory();
        
        Person p1 = pd.newPerson("Aniruddha");
        Person p2 = pd.newPerson("Sameer");
        Person p3 = pd.newPerson("Sunil");
        Person p4 = pd.newPerson("Anil");
        Person p5 = pd.newPerson("Ram");
        Person p6 = pd.newPerson("Neha");
        Person p7 = pd.newPerson("Shraddha");
        Person p8 = pd.newPerson("Reva");
        Person p9 = pd.newPerson("Saket");
        Person p10 = pd.newPerson("Kal B");
        Person p11 = pd.newPerson("Mauel");
        Person p12 = pd.newPerson("Jassicka");
        Person p13 = pd.newPerson("pol");
        Person p14 = pd.newPerson("Peter");
        Person p15 = pd.newPerson("Path");
        Person p16 = pd.newPerson("Sanket");
        Person p17 = pd.newPerson("Naveen");
        Person p18 = pd.newPerson("Debbie");
        Person p19 = pd.newPerson("Amuthen");
        Person p20 = pd.newPerson("Vishal");
        
        StudentDirectory sd = department.getStudentDirectory();

        StudentProfile student1 = sd.newStudentProfile(p1);
        StudentProfile student2 = sd.newStudentProfile(p2);
        StudentProfile student3 = sd.newStudentProfile(p3);
        StudentProfile student4 = sd.newStudentProfile(p4);
        StudentProfile student5 = sd.newStudentProfile(p5);
        StudentProfile student6 = sd.newStudentProfile(p6);
        StudentProfile student7 = sd.newStudentProfile(p7);
        StudentProfile student8 = sd.newStudentProfile(p8);
        StudentProfile student9 = sd.newStudentProfile(p9);
        StudentProfile student10 = sd.newStudentProfile(p10);


        CourseCatalog coursecatalog = department.getCourseCatalog();
        Course course = coursecatalog.newCourse("app eng", "info 5100", 1);
        Course course1 = coursecatalog.newCourse("DMDW", "info 6100", 1);
        Course course2 = coursecatalog.newCourse("OOD", "CSYE 6200", 1);
        Course course3 = coursecatalog.newCourse("Data Science", "info 6150", 1);
        Course course4 = coursecatalog.newCourse("Web Dev", "info 7100", 1);
        Course course5 = coursecatalog.newCourse("Data Structures", "CS 4500", 1);
        Course course6 = coursecatalog.newCourse("Program Design Paradigm", "CS 5800", 1);
        Course course7 = coursecatalog.newCourse("Algorithms", "CS 5001", 1);
        
        department.addCoreCourse(course);
        department.addElectiveCourse(course1);
        department.addElectiveCourse(course2);
        department.addElectiveCourse(course3);
        department.addElectiveCourse(course4);
        department.addElectiveCourse(course5);
        department.addElectiveCourse(course6);
        department.addElectiveCourse(course7);



}
