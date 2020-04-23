package com.crud_posts.controller;

import com.crud_posts.model.User;
import com.crud_posts.repository.JavaIOUserRepositoryImpl;
import com.crud_posts.repository.UserRepository;

public class UserController implements Controller<User> {
    UserRepository userRepository = new JavaIOUserRepositoryImpl();

    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public void save(User entity) {

    }

    @Override
    public void update(User entity) {

    }

    @Override
    public void delete(Long id) {

    }
}
