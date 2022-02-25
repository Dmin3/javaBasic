package com.example.memo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class NoteEntity {

    private String title;
    private String content;

    // 수정
    void update(String content){
        this.content = content;
        dateFormat(); //수정시간
    }

    //삭제
    void remove(){

    }

    //생성자 생성
    private NoteEntity(String title, String content) {
        this.title = title;
        this.content = content;
        dateFormat();
    }

    //정적 메소드 생성
    static NoteEntity newInstance(String title, String content){
        return new NoteEntity(title, content);
    }


    // 날짜 포맷 메소드
    public String dateFormat(){
        LocalDateTime localDateTime = LocalDateTime.now();
        String now = localDateTime.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일"));
        return now;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
