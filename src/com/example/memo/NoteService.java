package com.example.memo;

import java.util.Scanner;

public class NoteService {
    private final NotePad notePad;

    public NoteService(){
        this.notePad = new NotePad();
    }
    public void run(){
        while (true){

        System.out.println("안녕하세요 codeLatte 메모장 입니다.");
        System.out.println("1.메모리스트 2.메모보기 3.메모작성 4.메모수정 5.메모삭제 6.메모종료");
        System.out.println("안녕하세요 codeLatte 메모장 입니다.");
        System.out.println("번호를 입력해주세요.");

        Scanner sc = new Scanner(System.in);
        int selectedNumber = sc.nextInt();

            if (1 == selectedNumber) {
                // TODO : 메모 전체보기 처리
                notePad.printAllNotes();
            } else if (2 == selectedNumber) {
                // TODO : 메모 상세보기 처리
                notePad.printNote();
            } else if (3 == selectedNumber) {
                // TODO : 메모 작성하기 처리
                notePad.addNote();
            } else if (4 == selectedNumber) {
                // TODO : 메모 수정하기 처리
                notePad.updateNote();
            } else if (5 == selectedNumber) {
                // TODO : 메모 삭제하기 처리

            } else if (6 == selectedNumber) {
                break;
            } else {
                System.out.println("");
                System.out.println("번호를 다시입력해주세요");
                System.out.println("");
            }

        }
        System.out.println("시스템을 종료합니다.");
    }

}
