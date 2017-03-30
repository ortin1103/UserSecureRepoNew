package com.nitro.Config;


import com.nitro.Repository.UserRepository;
import com.nitro.Security.UserDetailsServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
public class ConfigApp {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    public UserDetailsService userDetailsServiceBean() throws Exception {
        return new UserDetailsServiceImp(userRepository);
    }

}
