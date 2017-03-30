package com.nitro.Service;

import com.nitro.Entity.User;
import com.nitro.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;



    @Override
    public String addUser(User user) {
        userRepository.save(user);
        return "create";



    }

    @Override
    public void deleteUser(Long id) {
        userRepository.delete(id);


    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
     public Iterable<User> getUsers() {

        return userRepository.findAll();
    }
}
