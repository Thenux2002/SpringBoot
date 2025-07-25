package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1,
                        "Thenuka",
                        LocalDate.of(2002, 4, 3),
                        24,
                        "Thenukaravindu@gmail.com"
                )
        );
    }
}
