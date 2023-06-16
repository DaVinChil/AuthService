package com.hm.authservice;

public class InvalidCredentials extends RuntimeException{
    public InvalidCredentials(String msg){
        super(msg);
    }
}
