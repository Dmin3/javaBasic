package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream01 {
    public static void main(String[] args) {

        Integer[] arr = {2, 3, 1, 4, 15, 12, 16};

        List<Integer> list = Arrays.stream(arr).collect(Collectors.toList());

        Stream<Integer> sorted = list.stream().sorted();
        List<Integer> list2 = sorted.collect(Collectors.toList());

        long count = list.stream().filter(x -> x < 10).count();

        System.out.println(list);
        System.out.println(list2);
        System.out.println(sorted);
//        System.out.println(count);
//        System.out.println(count == 4); //true
//


    }
}
