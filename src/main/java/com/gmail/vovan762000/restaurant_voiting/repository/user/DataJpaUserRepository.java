package com.gmail.vovan762000.restaurant_voiting.repository.user;

import com.gmail.vovan762000.restaurant_voiting.model.User;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaUserRepository implements UserRepository {
    private static final Sort SORT_NAME_EMAIL = Sort.by(Sort.Direction.ASC, "name", "email");

    private final CrudUserRepository crudRepository;

    public DataJpaUserRepository(CrudUserRepository crudRepository) {
        this.crudRepository = crudRepository;
    }

    @Override
    public User save(User user) {
        return crudRepository.save(user);
    }

    @Override
    public boolean delete(Integer id) {
        return crudRepository.delete(id) != 0;
    }

    @Override
    public User get(Integer id) {
        return crudRepository.getById(id);
    }

    @Override
    public User getByEmail(String email) {
        return crudRepository.getByEmail(email);
    }

    @Override
    public User getWithVote(int id) {
        return crudRepository.getWithVote(id);
    }

    @Override
    public List<User> getAll() {
        return crudRepository.findAll(SORT_NAME_EMAIL);
    }

}
