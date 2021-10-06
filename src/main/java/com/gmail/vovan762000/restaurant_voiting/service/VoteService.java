package com.gmail.vovan762000.restaurant_voiting.service;

import com.gmail.vovan762000.restaurant_voiting.model.Vote;
import com.gmail.vovan762000.restaurant_voiting.repository.vote.VoteRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import java.util.List;

import static com.gmail.vovan762000.restaurant_voiting.util.ValidationUtil.checkNotFoundWithId;
import static com.gmail.vovan762000.restaurant_voiting.util.ValidationUtil.checkTime;

@Service
public class VoteService {

    private final VoteRepository repository;

    public VoteService(VoteRepository repository) {
        this.repository = repository;
    }

    public void delete(int id) {
        checkNotFoundWithId(repository.delete(id), id);
    }

    public Vote get(int id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public List<Vote> getAll() {
        return repository.getAll();
    }

    @Transactional
    public void update(Vote vote) {
        Assert.notNull(vote, "vote must not be null");
        checkTime(vote);
        checkNotFoundWithId(repository.save(vote), vote.id());
    }

}
