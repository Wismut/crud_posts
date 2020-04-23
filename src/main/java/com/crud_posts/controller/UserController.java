package com.crud_posts.controller;

import com.crud_posts.model.User;
import com.crud_posts.repository.JavaIOUserRepositoryImpl;
import com.crud_posts.repository.UserRepository;

import java.util.List;

public class UserController implements Controller {
    UserRepository userRepository = new JavaIOUserRepositoryImpl();

    public List<User> getUsers() {
        return userRepository.getAll();
    }

    public User getUserBy(Long id) {
        return userRepository.getBy(id);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteBy(Long id) {
        userRepository.deleteBy(id);
    }
}
