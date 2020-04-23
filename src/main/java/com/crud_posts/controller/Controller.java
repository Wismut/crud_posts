package com.crud_posts.controller;

public interface Controller<T> {
    T get(Long id);

    void save(T entity);

    void update(T entity);

    void delete(Long id);
}
