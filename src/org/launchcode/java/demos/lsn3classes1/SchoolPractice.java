package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        Student me = new Student();
        me.setName("Will");
        me.setStudentId(1);
        me.setGpa(4.0);
        me.setNumberOfCredits(1);

        System.out.println(me.getName());
    }
}
