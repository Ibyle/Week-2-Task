package org.example.entities;

import lombok.Getter;

@Getter
public class Person {
    private int StudentId;
    private String firstName;
    private String lastName;
    private int gradeLevel;

    private String email;
    private String guardianEmail1;
    private String guardianEmail2;
    private String teacherId;

    public void setStudentId(int studentId) {
        StudentId = studentId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setGuardianEmail1(String guardianEmail1) {
        this.guardianEmail1 = guardianEmail1;
    }

    public void setGuardianEmail2(String guardianEmail2) {
        this.guardianEmail2 = guardianEmail2;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    //    public int getStudentId() {
//        return StudentId;
//    }
//
//    public void setStudentId(int studentId) {
//        StudentID = studentId;
//    }
//
//    public String getFirstName() {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public int getGradeLevel() {
//        return gradeLevel;
//    }
//
//    public void setGradeLevel(int gradeLevel) {
//        this.gradeLevel = gradeLevel;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getGuardianEmail1() {
//        return guardianEmail1;
//    }
//
//    public void setGuardianEmail1(String guardianEmail1) {
//        this.guardianEmail1 = guardianEmail1;
//    }
//
//    public String getGetGuardianEmail2() {
//        return getGuardianEmail2;
//    }
//
//    public void setGetGuardianEmail2(String getGuardianEmail2) {
//        this.getGuardianEmail2 = getGuardianEmail2;
//    }
//
//    public String getTeacherId() {
//        return teacherId;
//    }
//
//    public void setTeacherId(String teacherId) {
//        this.teacherId = teacherId;
//    }

    @Override
    public String toString() {
        return "User{" +
                "StudentId=" + StudentId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gradeLevel=" + gradeLevel +
                ", email='" + email + '\'' +
                ", guardianEmail1='" + guardianEmail1 + '\'' +
                ", getGuardianEmail2='" + getGuardianEmail2() + '\'' +
                ", teacherId='" + teacherId + '\'' +
                '}';
    }
}

