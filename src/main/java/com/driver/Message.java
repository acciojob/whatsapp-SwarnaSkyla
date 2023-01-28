package com.driver;

import java.time.Instant;
import java.util.Date;

public class Message {
    private int id;
    private String content;
    private Date timestamp;

    public Message(int id,String content,Date timestamp){
        this.id=id;
        this.content=content;
        this.timestamp=new Date();
    }

}
