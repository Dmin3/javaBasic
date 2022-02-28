package com.stream.map;

import com.stream.StudentDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentMapSample {
    public static void main(String[] args) {

        StudentMapSample sample = new StudentMapSample();

        List<StudentDTO> student = new ArrayList<>();
        student.add(new StudentDTO("요다1", 10, 99, 80));
        student.add(new StudentDTO("만두2", 12, 90, 85));
        student.add(new StudentDTO("건빵3", 13, 80, 75));

        List<String> result = sample.printGetName(student);
        for (String s : result) {
            System.out.println(s);
        }

    }

    public List<String> printGetName(List<StudentDTO> student) {

        //map 으로 변경하여 Name 값만 출력해보자
        List<String> list = student.stream().map(x -> x.getName()).collect(Collectors.toList());

        return list;
    }



}
