package com.laundary.laundarymanagementsystem.controller;

import com.laundary.laundarymanagementsystem.entities.User;
import com.laundary.laundarymanagementsystem.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserService userService;

    public UserController(UserService userService){
    this.userService = userService;
    }

    @GetMapping("/")
    public List<User> getAllUsers()
    {
        return userService.getUsers();
    }

    @GetMapping("/{userId}")
    public User getUser(@PathVariable (value = "userId") Integer userId)
    {
        return userService.getUserById(userId);
    }

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user) {
        return userService.add(user);
    }

    @DeleteMapping("/{userId}")
    public String deleteUser(@PathVariable (value = "userId") Integer userId)
    {
        userService.delete(userId);
        return "SUCCESS";
    }

//    @GetMapping("/getByName/{name}")
//    public List<User> getUserByName(@PathVariable (value = "fullName") String fullName)
//    {
//        return userService.getUserByName(fullName);
//    }

}
