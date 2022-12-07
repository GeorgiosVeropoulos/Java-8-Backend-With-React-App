package dev.george.demouserproject.service;


import dev.george.demouserproject.model.User;
import dev.george.demouserproject.userrepository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User saveUser(User user){

        return userRepository.save(user);
    }
    public User findUserById(Long userId){
        return userRepository.findByUserId(userId);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
