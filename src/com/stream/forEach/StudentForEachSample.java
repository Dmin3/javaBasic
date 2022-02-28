package com.stream.forEach;

import com.stream.StudentDTO;

import java.util.ArrayList;
import java.util.List;

public class StudentForEachSample {
    public static void main(String[] args) {


        StudentForEachSample sample = new StudentForEachSample();

        List<StudentDTO> list = new ArrayList<>();
        list.add(new StudentDTO("요다", 10, 99, 80));
        list.add(new StudentDTO("만두", 12, 90, 85));
        list.add(new StudentDTO("건빵", 13, 80, 75));

        sample.printStudentName(list);

    }

    public void printStudentName(List<StudentDTO> list) {
        list.stream().forEach(x -> System.out.println(x.getName() + " " + x.getAge()));
//        list.stream().map(student -> student.getName()).forEach(System.out::println);
    }



}
