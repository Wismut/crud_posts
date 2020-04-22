package com.crud_posts.repository;

import java.util.List;

public interface GenericRepository<T, ID> {
    T save(T entity);

    T getBy(ID id);

    List<T> getAll();

    void deleteBy(ID id);

    int count();
}
