package com.ismael.schoolbackend.repository;

import com.ismael.schoolbackend.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
                .guardianName("Elisabeth")
                .guardianEmail("elisabeth@gmail.com")
                .guardianMobile("0746195664").build();

        studentRepository.save(student);
    }

}