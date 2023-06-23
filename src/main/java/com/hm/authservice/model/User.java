package com.hm.authservice.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class User {
    @NotBlank
    @Size(min = 1, max = 22)
    private String user;

    @Size(min = 1)
    private String password;

    User(){}

    User(String user, String password){
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
