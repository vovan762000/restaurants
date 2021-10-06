package com.gmail.vovan762000.restaurant_voiting.service;

import com.gmail.vovan762000.restaurant_voiting.model.User;
import com.gmail.vovan762000.restaurant_voiting.repository.user.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

import static com.gmail.vovan762000.restaurant_voiting.util.ValidationUtil.checkNotFound;
import static com.gmail.vovan762000.restaurant_voiting.util.ValidationUtil.checkNotFoundWithId;

@Service
public class UserService {
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public User create(User user) {
        Assert.notNull(user, "user must not be null");
        return repository.save(user);
    }

    public void delete(int id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public User get(int id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public User getByEmail(String email) {
        Assert.notNull(email, "email must not be null");
        return checkNotFound(repository.getByEmail(email), "email=" + email);
    }

    public List<User> getAll() {
        return repository.getAll();
    }

    @Transactional
    public void update(User user) {
        Assert.notNull(user, "user must not be null");
        checkNotFoundWithId(repository.save(user), user.id());
    }

    public User getWithVote(int id){
        return checkNotFoundWithId(repository.getWithVote(id), id);
    }
}
