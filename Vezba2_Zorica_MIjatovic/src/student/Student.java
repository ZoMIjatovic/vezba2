package student;

import course.Course;

public class Student {

    private String firstName;
    private String lastName;
    private int yearOfBirth;
    private Course course;

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

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }
    
    public Course getCourse(){
    return course;
    }
    
    public void setCourse(Course course){
    this.course = course;
    }
    
    public void info(){
        System.out.println("First Name is " + getFirstName());
        System.out.println("Last Name is " + getLastName());
        System.out.println("Yaer of birth " + getYearOfBirth());
    
    }
    
    public Student (){
    this.firstName = "defoult";
    this.lastName = "defoult";
    this.yearOfBirth = yearOfBirth;
    this.course = new Course();
    }
}
