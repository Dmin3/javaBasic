package com.exception;

public class Exception02 {
    public static void main(String[] args) {
        Exception02 sample = new Exception02();
//        sample.check1();
//        sample.check2();
        sample.check3();

    }

    public void check1() {
        int[] arr = new int[5];
        try {
            System.out.println(arr[5]);
            System.out.println("문제없이 실행 성공");
        } catch (Exception e) {
            System.out.println("문자열 길이는 " + arr.length);
            System.out.println("문제가 발생하여 CATCH");
        }
    }

    public void check2() {
        int[] arr = null;
        try {
            arr = new int[5];
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println(arr.length); // arr가 누군지 모른다
        } finally {
            System.out.println("난 무조건 실행 된다.");
        }
    }

    public void check3() {
        int[] arr = null;
        try {
            arr = new int[5];
            System.out.println(arr[4]);
        } catch (Exception e) {
            System.out.println(arr.length); // arr가 누군지 모른다
        } finally {
            try {
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("예외 잡았다");
            } finally {
                System.out.println("이중으로 결과를 확인 가능!");
            }
        }
    }

    }


