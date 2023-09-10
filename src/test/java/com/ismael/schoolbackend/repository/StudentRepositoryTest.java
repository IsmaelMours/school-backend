package com.ismael.schoolbackend.repository;

import com.ismael.schoolbackend.entity.Guardian;
import com.ismael.schoolbackend.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){
        Student student = Student.builder()
                .emailId("monnapuleismaelours@gmail.com")
                .firstName("Ismael")
                .lastName("Mours")
//                .guardianName("Elisabeth")
//                .guardianEmail("elisabeth@gmail.com")
//                    .guardianMobile("0746195664")

                .build();

        studentRepository.save(student);
    }
    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .email("elisabeth@gmail.com")
                .mobile("0746195664")
                .name("Elisabeth")
                .build();

        Student student = Student.builder()
                .firstName("monnapule")
                .lastName("Moabi")
                .emailId("mm@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printAllStudent(){
        List<Student> studentList =  studentRepository.findAll();

        System.out.println("studentList = " + studentList);
    }

    @Test
    public void printStudentByFirstName()
    {

        List<Student> student = studentRepository.findByFirstName("Ismael");

        System.out.println("Student name = " + student);
    }
    @Test
    public void printStudentByLastName()
    {

        List<Student> student = studentRepository.findByLastName("Moabi");

        System.out.println("Student last name = " + student);
    }

    @Test
    public void printGetStudentByEmailAddress(){

        Student student = studentRepository.getStudentByEmailAddress(
             "mm@gmail.com"
        );
        System.out.println("Student last name = " + student);
    }
}