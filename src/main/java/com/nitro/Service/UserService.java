package com.nitro.Service;

import com.nitro.Entity.User;

/**
 * Created by denis on 30.03.17.
 */
public interface UserService {
    public void save(User user);
    public User findByUsername(String username);
}
