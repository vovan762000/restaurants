package com.gmail.vovan762000.restaurant_voiting.service;

import com.gmail.vovan762000.restaurant_voiting.model.Vote;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringRunner.class)
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public class VoteServiceTest {

    @Autowired
    private VoteService service;

    @Test
    public void delete() {
    }

    @Test
    public void get() {
        Vote vote = service.get(100017);
    }

    @Test
    public void getAll() {
        service.getAll();
    }

    @Test
    public void update() {
    }
}