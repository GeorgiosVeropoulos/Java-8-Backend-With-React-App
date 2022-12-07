package dev.george.demouserproject.controller;


import dev.george.demouserproject.model.User;
import dev.george.demouserproject.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@CrossOrigin(origins ="http://localhost:3000/")
@RequestMapping
@Slf4j
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(value = "/")
    public String GetPage(){
        return "Welcome";
    }
    @PostMapping(value = "/create")
    public User CreateUser(@RequestBody User userModel){

        return userService.saveUser(userModel);

    }

    @GetMapping(value = "/{id}")
    public User GetUserById(@PathVariable("id") Long userId){

        return userService.findUserById(userId);
    }

    @GetMapping(value = "/users")
    public List<User> GetAllUsers(){
        return userService.getAllUsers();
    }
}
