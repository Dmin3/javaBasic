package com.example;

public class Person {

    String name; // 인스턴스 변수
    int age; // 인스턴스 변수
    String sex; // 인스턴스 변수
    // 정적 변수
    static int c = 1;

    // 정적 메소드
    static int plus(int a, int b){
        return a + b + c;
    }

}
