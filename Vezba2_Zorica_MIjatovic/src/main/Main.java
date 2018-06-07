package main;

import course.Course;
import student.Student;

public class Main {

       public static void main(String[] args) {
           
       Student s1 = new Student();
       s1.info();
       s1.setFirstName("Miki");
       s1.setLastName("Mikic");
       s1.setYearOfBirth(1983);
       s1.info();
           System.out.println(s1.getCourse().getName());
       
       Course c1 = new Course();
       c1.showData();
       c1.setName("qa");
       c1.setNumberOfClasses(34);
       c1.showData();
       c1.setName("frontend");
       c1.setNumberOfClasses(25);
       c1.showData();
      
       
    }
    
}
