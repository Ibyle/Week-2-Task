package org.example.services;

import org.example.entities.Staff.Principal;
import org.example.entities.Staff.Teacher;
import org.example.entities.Student;

public interface PrincipalServices {
    String admitStudents(Student student);
    String employTeacher(Teacher teacher);
void paySalary(Principal principal, Teacher teacher);
    String awardOrExpel(Student student);
void sackTeacher(Principal principal, Teacher teacher);

}
