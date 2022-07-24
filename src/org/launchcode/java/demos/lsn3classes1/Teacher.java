package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;
// CONSTRUCTOR
public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
    this.firstName = firstName;
    this.lastName = lastName;
    this.subject = subject;
    this.yearsTeaching = yearsTeaching;
}
// GETTERS
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getSubject(){
        return subject;
    }
    public int getYearsTeaching() {
        return yearsTeaching;
    }
// SETTERS

    public void setFirstName(String aFirstName){
    firstName = aFirstName;
    }
    public void setLastName(String aLastName){
        lastName = aLastName;
    }
    public void setSubject(String aSubject){
        subject = aSubject;
    }
    public void setYearsTeaching(int aYearsTeaching){
        yearsTeaching = aYearsTeaching;
    }
}
