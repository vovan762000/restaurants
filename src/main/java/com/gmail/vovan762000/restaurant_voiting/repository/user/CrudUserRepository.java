package com.gmail.vovan762000.restaurant_voiting.repository.user;

import com.gmail.vovan762000.restaurant_voiting.model.User;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly = true)
public interface CrudUserRepository extends JpaRepository<User,Integer> {
    @Transactional
    @Modifying
    @Query("DELETE FROM User u WHERE u.id=:id")
    int delete(@Param("id") int id);

    User getByEmail(String email);

    @Query("SELECT u FROM User u WHERE u.id=?1")
    User getById (Integer id);

    @Query("SELECT u FROM User u LEFT JOIN FETCH u.vote WHERE u.id=?1")
    User getWithVote(int id);
}
