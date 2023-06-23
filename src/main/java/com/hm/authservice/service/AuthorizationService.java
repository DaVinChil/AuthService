package com.hm.authservice.service;

import com.hm.authservice.repository.UserRepository;
import com.hm.authservice.exception.InvalidCredentials;
import com.hm.authservice.exception.UnauthorizedUser;
import com.hm.authservice.model.Authorities;
import com.hm.authservice.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorizationService {

    private UserRepository userRepository;

    @Autowired
    public AuthorizationService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public List<Authorities> getAuthorities(User user){
        String name = user.getUser();
        String password = user.getPassword();
        if(isEmpty(name) || isEmpty(password)){
            throw new InvalidCredentials("User name or password is empty");
        }
        List<Authorities> userAuthorities = userRepository.getUserAuthorities(name, password);
        if(isEmpty(userAuthorities)){
            throw new UnauthorizedUser("Unknown user " + name);
        }

        return userAuthorities;
    }

    private boolean isEmpty(String str){
        return str == null || str.isEmpty();
    }

    private boolean isEmpty(List<?> str){
        return str == null || str.isEmpty();
    }
}
