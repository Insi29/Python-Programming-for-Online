package com.example.talksquad.Model;

public class User {
    private String Id;
    private String username;
    private String ImageURL;
    public User(String user_id, String userName, String image_URL){
        Id=user_id;
        username=userName;
        ImageURL=image_URL;

    }
    public User(){

    }
    //public void setUsername(String u){
    //  username=u;

    //}

    public String getUsername() {
        return username;
    }



    public String getImageURL() {
        return ImageURL;
    }


    public String getId() {
        return Id;
    }

}


