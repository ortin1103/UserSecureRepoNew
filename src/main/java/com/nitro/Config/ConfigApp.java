package com.nitro.Config;


import com.nitro.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigApp {

    @Autowired
    private UserRepository userRepository;


}
