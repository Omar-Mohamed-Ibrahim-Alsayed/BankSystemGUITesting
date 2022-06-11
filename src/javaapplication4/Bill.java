package javaapplication4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill {
    private String src;
    private String time;
    private String content;
    private double amount;

    public Bill(String src, String content, double amount) {
        this.time = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss").format(LocalDateTime.now());
        this.src = src;
        this.content = content;
        this.amount = amount;
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

    public double getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
