package com.gmail.vovan762000.restaurant_voiting;

import com.gmail.vovan762000.restaurant_voiting.model.Role;
import com.gmail.vovan762000.restaurant_voiting.model.User;

import java.util.Collections;
import java.util.Date;

import static com.gmail.vovan762000.restaurant_voiting.VoteTestData.ADMIN_VOTE;
import static com.gmail.vovan762000.restaurant_voiting.VoteTestData.USER_VOTE;
import static com.gmail.vovan762000.restaurant_voiting.model.AbstractBaseEntity.START_SEQ;

public class UserTestData {
    public static final MatcherFactory<User> MATCHER = MatcherFactory.usingIgnoringFieldsComparator("registered", "roles", "vote");

    public static final int USER_ID = START_SEQ;
    public static final int ADMIN_ID = START_SEQ + 1;
    public static final int NOT_FOUND = 10;

    public static final User user = new User(USER_ID, "User", "user@yandex.ru", "password", Role.USER);
    public static final User admin = new User(ADMIN_ID, "Admin", "admin@gmail.com", "admin", Role.ADMIN);

    static {
        user.setVote(USER_VOTE);
        admin.setVote(ADMIN_VOTE);
    }
    public static User getNew() {
        return new User(null, "New", "new@gmail.com", "newPass", false, new Date(), Collections.singleton(Role.USER));
    }

    public static User getUpdated() {
        User updated = new User(user);

// In case of update with user.id=null in body needs workaround
// ValidationUtil.assureIdConsistent called after validation
//      updated.setEmail("update@gmail.com");
        updated.setName("UpdatedName");
        updated.setPassword("newPass");
        updated.setEnabled(false);
        updated.setRoles(Collections.singletonList(Role.ADMIN));
        return updated;
    }
}
