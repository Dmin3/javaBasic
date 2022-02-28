package com.stream.filter;

import com.stream.StudentDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentFilterSample {
    public static void main(String[] args) {

        StudentFilterSample sample = new StudentFilterSample();

        List<StudentDTO> student = new ArrayList<>();
        student.add(new StudentDTO("요다2", 10, 99, 80));
        student.add(new StudentDTO("만두3", 12, 90, 85));
        student.add(new StudentDTO("건빵4", 13, 80, 75));

        sample.printFilterMethod(student);
    }

    public void printFilterMethod(List<StudentDTO> list) {
        // 80점이 넘는 학생만 반환해보자
        list.stream().filter(x -> x.getScoreEnglish() >= 80).forEach(student -> System.out.println(student.getName()));

    }

}
