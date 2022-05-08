package com.yeop.boardTimeout.domain;

import java.time.LocalDate;
import java.util.Objects;

public class BoardDTO {
    private Integer bno;
    private int ref;
    private int step;
    private int depth;
    private String title;
    private String contents;
    private String writer;
    private LocalDate regDate;
    private String blind_yn;


    public BoardDTO(int ref, int step, int depth, String title, String contents, String writer) {
        this.ref = ref;
        this.step = step;
        this.depth = depth;
        this.title = title;
        this.contents = contents;
        this.writer = writer;
    }

    public Integer getBno() {
        return bno;
    }

    public void setBno(Integer bno) {
        this.bno = bno;
    }

    public int getRef() {
        return ref;
    }

    public void setRef(int ref) {
        this.ref = ref;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public LocalDate getRegDate() {
        return regDate;
    }

    public void setRegDate(LocalDate regDate) {
        this.regDate = regDate;
    }

    public String getBlind_yn() {
        return blind_yn;
    }

    public void setBlind_yn(String blind_yn) {
        this.blind_yn = blind_yn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BoardDTO boardDTO = (BoardDTO) o;
        return ref == boardDTO.ref && step == boardDTO.step && depth == boardDTO.depth && bno.equals(boardDTO.bno) && title.equals(boardDTO.title) && contents.equals(boardDTO.contents) && writer.equals(boardDTO.writer) && blind_yn.equals(boardDTO.blind_yn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bno, ref, step, depth, title, contents, writer, blind_yn);
    }

    @Override
    public String toString() {
        return "BoardDTO{" +
                "bno=" + bno +
                ", ref=" + ref +
                ", step=" + step +
                ", depth=" + depth +
                ", title='" + title + '\'' +
                ", contents='" + contents + '\'' +
                ", writer='" + writer + '\'' +
                ", regDate=" + regDate +
                ", blind_yn='" + blind_yn + '\'' +
                '}';
    }
}
