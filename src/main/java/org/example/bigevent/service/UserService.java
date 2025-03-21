package org.example.bigevent.service;

import org.example.bigevent.pojo.User;
import org.springframework.stereotype.Service;

/**
 * Author: Vivienne
 */

public interface UserService {
    //根据用户名查询用户
    User findByUsername(String username);

    //注册
    void register(String username, String password);

    void update(User user);
}
