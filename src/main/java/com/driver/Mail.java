package com.driver;
import java.util.*;

public class Mail {
    Date date;
    String sender;

    String message;

    public Mail(Date date , String sender, String message) {
        this.date = date;
        this.sender = sender;
        this.message = message;
    }
}
