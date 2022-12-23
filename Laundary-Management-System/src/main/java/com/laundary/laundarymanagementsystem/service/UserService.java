package com.laundary.laundarymanagementsystem.service;

import com.laundary.laundarymanagementsystem.entities.User;
import com.laundary.laundarymanagementsystem.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getUsers() {
        return userRepository.findAll();
    }


    public User getUserById(Integer id) {
        // TODO Auto-generated method stub
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("there's no such server"));
    }


    public User add(User user) {
        // TODO Auto-generated method stub
        return userRepository.save(user);
    }


    public void delete(Integer id) {
        // TODO Auto-generated method stub
        userRepository.deleteById(id);
    }


//    public List<LaundaryDetails> getLaundaryDetailsByUserId(Integer userId) {
//        // TODO Auto-generated method stub
//        return userRepository.findLaundaryDetailsByUserId(userId);
//    }

}
