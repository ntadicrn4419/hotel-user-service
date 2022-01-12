package com.sk.hoteluserservice.dto;

public class NotificationDto {
    private String to;
    private String subject;
    private String content;

    public NotificationDto(String to, String subject, String content) {
        this.to = to;
        this.subject = subject;
        this.content = content;
    }
    public NotificationDto(){

    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
