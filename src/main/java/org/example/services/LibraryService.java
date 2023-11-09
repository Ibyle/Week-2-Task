package org.example.services;

import org.example.entities.Book;
import org.example.entities.Person;
import org.example.entities.Staff.Teacher;
import org.example.entities.Student;
import org.example.entities.User;

import java.util.List;


    public interface LibraryService {
        void teacherSeniorJuniorPriority(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book) ;


        void firstComeFirstServed(List<Person> teacher, List<Person> seniorStudentList, List<Person> juniorStudentList, Book book);
    }

