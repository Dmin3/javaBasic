package com.exception;

public class Exception03 {
    public static void main(String[] args) {
        Exception03 sample = new Exception03();
        sample.check1();
    }

    public void check1() {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("첫 번째 예외입니다.");
        } catch (Exception e) {
            System.out.println("두 번째 예외입니다.");
        }



    }
}
