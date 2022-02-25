package com.exception;

public class CustomException {
    public static void main(String[] args) throws MyException {
        CustomException a = new CustomException();
        a.check01(11);
    }

    public void check01(int num){
        try {
            if (num > 10) {
                throw new MyException("숫자가 초과입니다.");
            }
            System.out.println("결과는 : " + num);
        } catch (MyException e) {
            System.out.println("CATCH 성공");
        }
    }
}
