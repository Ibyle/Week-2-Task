package org.example;
import org.example.entities.Person;
import org.example.entities.Student;
import org.example.serviceImplematn.PrincipalServiceImpl;
import org.example.serviceImplematn.TeacherServiceImpl;
import java.util.List;
import static org.example.serviceImplematn.StudentDetailsImpl.readExcelDetails;
import static org.example.serviceImplematn.TeacherServiceImpl.readExcelDetail;

import org.example.entities.Staff.Principal;
import org.example.entities.Staff.Teacher;
import org.example.enums.Behaviour;
import org.example.enums.Qualification;
import org.example.services.PrincipalServices;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {



    public static void main(String[] args) {
        //TeacherServiceImplementation//
        System.out.println("Teacher Details");
        TeacherServiceImpl teacherService = new TeacherServiceImpl();
        List<Person> teacher = readExcelDetail("Dataset.csv");

        //PrincipalServiceImplementation//
        PrincipalServiceImpl principalService = new PrincipalServiceImpl();


        //StudentDetailsImplementation//
        System.out.println("Student Details");
        List<Person> studentDetails = readExcelDetails("Dataset2.csv","");


//PrincipalServices principalServices = new PrincipalServiceImpl();

//        // Admitting students
//        Student student1 = new Student("John", 30);
//        String admissionStatus1 = principalServices.admitStudents(student1);
//        System.out.println(admissionStatus1);
//
//
//
//        // Employing teachers
//        Teacher teacher1 = new Teacher("Michael", Qualification.PHD);
//        String employmentStatus1 = principalServices.employTeacher(teacher1);
//        System.out.println(employmentStatus1);
//
//        Teacher teacher2 = new Teacher("Sarah", Qualification.HND);
//        String employmentStatus2 = principalServices.employTeacher(teacher2);
//        System.out.println(employmentStatus2);
//
//        // Paying salary
//        Principal principal = new Principal("James");
//        principalServices.paySalary(principal, teacher1);
//
//
//
//        // Awarding or expelling a student
//        Student student3 = new Student("Mark", Behaviour.EXCEPTIONAL.ordinal());
//        String awardStatus1 = principalServices.awardOrExpel(student3);
//        System.out.println(awardStatus1);
//
//        Student student4 = new Student("Emily", Behaviour.WORSE.ordinal());
//        String awardStatus2 = principalServices.awardOrExpel(student4);
//        System.out.println(awardStatus2);


//            ArrayList<Course> subject = new ArrayList<>();
//            subject.add(new Course());
//            subject.add(new Course());
//            subject.add(new Course());
//            subject.add(new Course());
//
//            HashMap<String, Student> students = new HashMap<>();
//            students.put("Bayo", new Student("Bayo"));
//            students.put("Collins", new Student("Collins"));
//            students.put("Bright", new Student("Bright"));
//            students.put("Williams", new Student("Williams"));
//
//            for (Student student : students.values()) {
//                for (Course course : student.getCourses()) {
//                    student.addCourse(course);
//                }
//            }
//
//            // Print student names and their courses
//            for (Student student : students.values()) {
//                System.out.println("Student: " + student.getName());
//                System.out.println("Courses: ");
//                for (Course course : student.getCourses()) {
//                    System.out.println(course.getName());
//                }
//                System.out.println();
//            }
        }
    }






