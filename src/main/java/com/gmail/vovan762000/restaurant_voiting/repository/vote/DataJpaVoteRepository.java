package com.gmail.vovan762000.restaurant_voiting.repository.vote;

import com.gmail.vovan762000.restaurant_voiting.model.Vote;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DataJpaVoteRepository implements VoteRepository {

    private final CrudVoteRepository repository;

    public DataJpaVoteRepository(CrudVoteRepository repository) {
        this.repository = repository;
    }

    @Override
    public Vote get(Integer id) {
        return repository.getById(id);
    }

    @Override
    public Vote save(Vote vote) {
        return repository.save(vote);
    }

    @Override
    public boolean delete(Integer id) {
        return repository.delete(id) != 0;
    }

    @Override
    public List<Vote> getAll() {
        return repository.findAll();
    }
}
