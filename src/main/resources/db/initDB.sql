DROP TABLE IF EXISTS user_roles;
DROP TABLE IF EXISTS users;
DROP TABLE IF EXISTS restaurant ;
DROP TABLE IF EXISTS dish;
DROP TABLE IF EXISTS vote;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE GLOBAL_SEQ AS INTEGER START WITH 100000;

CREATE TABLE users
(
    id         INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name       VARCHAR(255)            NOT NULL,
    email      VARCHAR(255)            NOT NULL,
    password   VARCHAR(255)            NOT NULL,
    registered TIMESTAMP DEFAULT now() NOT NULL,
    enabled    BOOLEAN   DEFAULT TRUE  NOT NULL
);
CREATE UNIQUE INDEX users_unique_email_idx
    ON USERS (email);

CREATE TABLE user_roles
(
    user_id INTEGER NOT NULL,
    role    VARCHAR(255),
    CONSTRAINT user_roles_idx UNIQUE (user_id, role),
    FOREIGN KEY (user_id) REFERENCES USERS (id) ON DELETE CASCADE
);

CREATE TABLE restaurant
(
    id   INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name VARCHAR(255) NOT NULL
);

CREATE TABLE vote
(
    vote_id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    date_time     TIMESTAMP NOT NULL,
    user_id       INTEGER   NOT NULL,
    restaurant_id INTEGER   NOT NULL,
    FOREIGN KEY (user_id) REFERENCES USERS (id),
    FOREIGN KEY (restaurant_id) REFERENCES restaurant (id)
);

CREATE TABLE dish
(
    dish_id       INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
    name          VARCHAR(255) NOT NULL,
    price         DECIMAL      not null,
    restaurant_id INTEGER      NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant (id)
);

-- CREATE UNIQUE INDEX meals_unique_user_datetime_idx
--     ON meals (user_id, date_time)