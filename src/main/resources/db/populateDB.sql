DELETE FROM user_roles;
DELETE FROM users;
DELETE FROM restaurant;
DELETE FROM vote;
DELETE FROM dish;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO users (name, email, password)
VALUES ('User', 'user@yandex.ru', 'password'),
       ('Admin', 'admin@gmail.com', 'admin');

INSERT INTO user_roles (role, user_id)
VALUES ('USER', 100000),
       ('ADMIN', 100001);

INSERT INTO restaurant (name)
VALUES ('Stargorod'),
       ('Favorite Place'),
       ('Argentina Grill');

INSERT INTO dish (name, price, restaurant_id)
VALUES ('dish 1',10.99, 100002),
       ('dish 2',5.99, 100002),
       ('dish 3',6.00, 100002),
       ('dish 4',10, 100002),
       ('dish 5',19.99, 100003),
       ('dish 6',3.99, 100003),
       ('dish 7',17, 100003),
       ('dish 8',3, 100003),
       ('dish 9',7, 100004),
       ('dish 10',5.5, 100004),
       ('dish 11',4, 100004),
       ('dish 12',26, 100004);

INSERT INTO vote (date_time, user_id, restaurant_id)
VALUES  ('2021-09-26 10:00:00',100000,100004),
        ('2021-09-26 14:00:00',100001,100003);
