package com.gmail.vovan762000.restaurant_voiting.service;

import com.gmail.vovan762000.restaurant_voiting.UserTestData;
import com.gmail.vovan762000.restaurant_voiting.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.junit4.SpringRunner;

import static com.gmail.vovan762000.restaurant_voiting.UserTestData.MATCHER;
import static com.gmail.vovan762000.restaurant_voiting.UserTestData.USER_ID;

@ContextConfiguration({
        "classpath:spring/spring-app.xml",
        "classpath:spring/spring-db.xml"
})
@RunWith(SpringRunner.class)
@Sql(scripts = "classpath:db/populateDB.sql", config = @SqlConfig(encoding = "UTF-8"))
public class UserServiceTest {

    @Autowired
    private UserService service;

    @Test
    public void create() {
    }

    @Test
    public void delete() {
    }

    @Test
    public void get() {
        User user = service.get(USER_ID);
        MATCHER.assertMatch(user, UserTestData.user);
    }

    @Test
    public void getByEmail() {
    }

    @Test
    public void getAll() {
    }

    @Test
    public void update() {
    }

    @Test
    public void getByIdWithVote() {
    }
}