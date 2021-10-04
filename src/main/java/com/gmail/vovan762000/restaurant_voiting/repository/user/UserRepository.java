package com.gmail.vovan762000.restaurant_voiting.repository.user;

import com.gmail.vovan762000.restaurant_voiting.model.User;
import com.gmail.vovan762000.restaurant_voiting.repository.BaseRepository;

import java.util.List;

public interface UserRepository extends BaseRepository<User,Integer> {

    // null if not found
    User getByEmail(String email);

}
