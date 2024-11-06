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

        CourseSchedule courseschedule = department.newCourseSchedule("Fall2024");
        
        CourseOffer courseoffer = courseschedule.newCourseOffer("info 5100");
        if (courseoffer == null) return;
        courseoffer.generatSeats(20);

        CourseOffer courseoffer1 = courseschedule.newCourseOffer("info 6100");
        if (courseoffer1 == null) return;
        courseoffer1.generatSeats(20);

        CourseOffer courseoffer2 = courseschedule.newCourseOffer("CSYE 6200");
        if (courseoffer2 == null) return;
        courseoffer2.generatSeats(20);

        CourseOffer courseoffer3 = courseschedule.newCourseOffer("info 6150");
        if (courseoffer3 == null) return;
        courseoffer3.generatSeats(20);

        CourseOffer courseoffer4 = courseschedule.newCourseOffer("info 7100");
        if (courseoffer4 == null) return;
        courseoffer4.generatSeats(20);

        CourseOffer courseoffer5 = courseschedule.newCourseOffer("CS 4500");
        if (courseoffer5 == null) return;
        courseoffer5.generatSeats(20);

        CourseOffer courseoffer6 = courseschedule.newCourseOffer("CS 5800");
        if (courseoffer6 == null) return;
        courseoffer6.generatSeats(20);

        CourseOffer courseoffer7 = courseschedule.newCourseOffer("CS 5001");
        if (courseoffer7 == null) return;
        courseoffer7.generatSeats(20);
        
        FacultyDirectory fd = department.getFacultyDirectory();
        
        FacultyProfile f1 = fd.newFacultyProfile(p11);
        FacultyProfile f2 = fd.newFacultyProfile(p12);
        FacultyProfile f3 = fd.newFacultyProfile(p13);
        FacultyProfile f4 = fd.newFacultyProfile(p14);
        FacultyProfile f5 = fd.newFacultyProfile(p15);
        FacultyProfile f6 = fd.newFacultyProfile(p16);
        FacultyProfile f7 = fd.newFacultyProfile(p17);
        FacultyProfile f8 = fd.newFacultyProfile(p18);

        courseoffer.AssignAsTeacher(f1);
        courseoffer1.AssignAsTeacher(f2);
        courseoffer2.AssignAsTeacher(f3);
        courseoffer3.AssignAsTeacher(f4);
        courseoffer4.AssignAsTeacher(f5);
        courseoffer5.AssignAsTeacher(f6);
        courseoffer6.AssignAsTeacher(f7);
        courseoffer7.AssignAsTeacher(f8);

        CourseLoad courseload1 = student1.newCourseLoad("Fall2024");
        CourseLoad courseload2 = student2.newCourseLoad("Fall2024");
        CourseLoad courseload3 = student3.newCourseLoad("Fall2024");
        CourseLoad courseload4 = student4.newCourseLoad("Fall2024");
        CourseLoad courseload5 = student5.newCourseLoad("Fall2024");
        CourseLoad courseload6 = student6.newCourseLoad("Fall2024");
        CourseLoad courseload7 = student7.newCourseLoad("Fall2024");
        CourseLoad courseload8 = student8.newCourseLoad("Fall2024");
        CourseLoad courseload9 = student9.newCourseLoad("Fall2024");
        CourseLoad courseload10 = student10.newCourseLoad("Fall2024");


}
