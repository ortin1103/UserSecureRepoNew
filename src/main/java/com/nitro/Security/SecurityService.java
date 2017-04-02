package com.nitro.Security;

/**
 * Created by Nitro on 02.04.2017.
 */
public interface SecurityService {
    public String findLoggedInUsername();
    public void autologin(String username, String password);

}
