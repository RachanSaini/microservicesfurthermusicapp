package com.stackroute.track.exceptions;

public class TrackAlreadyExists extends  Exception{
    private String message;

    public  TrackAlreadyExists(String message){
        super(message);
        this.message=message;
    }

}
