
package com.example.talksquad.Model;

public class Chat {
    private String sender;
    private String reciever;
    private String message;


    public Chat(String Sender, String Reciever, String Message) {
        sender = Sender;
        reciever = Reciever;
        message = Message;
    }

    public Chat() {

    }

    public String getSender() {
        return sender;
    }

    public String getReciever() {
        return reciever;
    }

    public String getMessage() {
        return message;
    }
}


