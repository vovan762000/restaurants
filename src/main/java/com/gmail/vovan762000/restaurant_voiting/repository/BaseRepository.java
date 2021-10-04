package com.gmail.vovan762000.restaurant_voiting.repository;

import com.gmail.vovan762000.restaurant_voiting.model.Vote;

import java.util.List;

public interface BaseRepository<T,I> {
    // null if not found
    T get(I id) ;

    // null if not found, when updated
    T save (T vote);

    // false if not found
    boolean delete(I id);

    List<T> getAll();
}
