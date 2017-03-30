package com.nitro.Service;

import com.nitro.Entity.User;

/**
 * Created by denis on 30.03.17.
 */
public interface UserService {
    public String addUser(User user);
    public void deleteUser(Long id);
    public User getUser(Long id);
    public Iterable<User> getUsers();
}
