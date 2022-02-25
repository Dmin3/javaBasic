package com.exception;

public class Exception04 {
    public static void main(String[] args) throws Exception {
        Exception04 a = new Exception04();
        a.check02(11);
    }

    public void check01(int num) {

        try {
            if (num > 10) {
                throw new Exception("숫자가 초과입니다.");
            }
            System.out.println("결과는 : " + num);
        } catch (Exception e) {
            System.out.println("CATCH 성공");
        }
    }

    public void check02(int num) throws Exception {
            if (num > 10) {
                throw new Exception("숫자가 초과입니다.");
            }
            System.out.println("결과는 : " + num);
    }
}
