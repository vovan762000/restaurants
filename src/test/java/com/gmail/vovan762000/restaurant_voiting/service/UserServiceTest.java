package com.gmail.vovan762000.restaurant_voiting.service;

import com.gmail.vovan762000.restaurant_voiting.UserTestData;
import com.gmail.vovan762000.restaurant_voiting.model.User;
import org.junit.jupiter.api.Test;
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
class UserServiceTest {

    @Autowired
    private final UserService service;

    @Test
    void create() {
    }

    @Test
    void delete() {
    }

    @Test
    void get() {
        User user = service.get(USER_ID);
        MATCHER.assertMatch(user, UserTestData.user);
    }

    @Test
    void getByEmail() {
    }

    @Test
    void getAll() {
    }

    @Test
    void update() {
    }

    @Test
    void getByIdWithVote() {
    }
}