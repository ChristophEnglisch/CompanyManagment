package main.java.cenglisch.hiring.domain;

import java.util.Optional;
import java.util.UUID;

public interface Repository<T, U> {

    Optional<T> find(U id);

    T create(T entity);

    void update(T entity);

    void delete(U id);

    default String generateId() {
        return UUID.randomUUID().toString().toUpperCase();
    }
}

