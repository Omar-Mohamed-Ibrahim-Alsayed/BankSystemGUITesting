package javaapplication4;

import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Notification {
    String src;
    String time;
    String content;

    public Notification(String src, String content) {
        this.time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
        this.src = src;
        this.content = content;
    }

    public String getSrc() {
        return src;
    }

    public String getTime() {
        return time;
    }

    public String getContent() {
        return content;
    }
}
