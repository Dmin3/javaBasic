package com.example.memo;

import java.util.Scanner;

public class NotePad {

    private int noteLength = 0; //메모장의 길이
    private final NoteEntity[] noteEntities; // 여러 메모지를 만들수 있도록 메모장 배열 선언
    private final int NOTE_SIZE = 20; // 메모장 사이즈를 정적변수(클래스변수)로 선언

    // 생성자 주입
    public NotePad(){
        this.noteEntities = new NoteEntity[NOTE_SIZE];
    }

    // 메모 작성 메소드
    public void addNote(){
        System.out.println("");
        if (NOTE_SIZE == noteLength){
            System.out.println("메모가 꽉찼습니다.");
            System.out.println("");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("제목을 작성해주세요");
        String title = sc.nextLine();
        System.out.println("본문을 작성해주세요");
        String content = sc.nextLine();

        noteEntities[noteLength++] = NoteEntity.newInstance(title, content); //클래스 메소드로 객체 필요없이 만들어주었다.

        System.out.println("메모가 작성되었습니다");
        System.out.println("");
    }

    // 메모 전체보기
    public void printAllNotes(){
        System.out.println("");
        if (noteLength == 0){
            System.out.println("작성된 메모가 없습니다.");
            System.out.println("");
            return;
        }

        for (int i =0; i < noteLength; i++){
            NoteEntity noteEntity = noteEntities[i];

            String headLine = String.format("번호: %d 제목: %s 작성날짜: %s", i, noteEntity.getTitle() , noteEntity.dateFormat());

            System.out.println(headLine);
        }
        System.out.println("");
    }

    // 메모 상세보기
    public void printNote(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("확인할 메모의 번호를 입력해주세요");
        int selectNumber = sc.nextInt();

        NoteEntity noteEntity = noteEntities[selectNumber];
        if (noteEntity == null){
            System.out.println("작성된 메모가 없습니다");
            System.out.println("");
            return;
        }

        String headLine = String.format("번호 : %d 제목 : %s", noteLength, noteEntity.getTitle());
        System.out.println(headLine);
        System.out.println("작성날짜 :" + noteEntity.dateFormat());
        System.out.println(noteEntity.getContent());
        System.out.println("");
    }

    // 메모 수정하기
    public void updateNote(){
        System.out.println("");
        Scanner sc = new Scanner(System.in);
        System.out.println("수정하실 메모번호를 입력해주세요");
        int selectNumber = Integer.parseInt(sc.nextLine());

        NoteEntity noteEntity = noteEntities[selectNumber];
        if (noteEntity == null){
            System.out.println("존재하지 않는 메모입니다");
            System.out.println("");
            return;
        }

        System.out.println("본문을 작성해주세요");

        String content = sc.nextLine();
        noteEntity.update(content);

        System.out.println("메모가 수정되었습니다.");
        System.out.println("");
    }



}
