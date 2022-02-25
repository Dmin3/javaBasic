package com.exception;

public class Exception01 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]);
            System.out.println("실행이 될까?");
        } catch (Exception e) {
            System.out.println("CATCH 성공");
        }
    }
}
