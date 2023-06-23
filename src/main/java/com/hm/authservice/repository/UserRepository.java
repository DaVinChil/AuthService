package com.hm.authservice.repository;

import com.hm.authservice.model.Authorities;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.List;

@Component
public class UserRepository {
    public List<Authorities> getUserAuthorities(String user, String password){
        if(user.startsWith("Admin") && password.equals("322228")){
            return List.of(Authorities.WRITE, Authorities.READ, Authorities.DELETE);
        }

        return Collections.emptyList();
    }
}
