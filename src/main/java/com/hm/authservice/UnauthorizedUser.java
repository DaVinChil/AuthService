package com.hm.authservice;

public class UnauthorizedUser extends RuntimeException{
    public UnauthorizedUser(String msg){
        super(msg);
    }
}
