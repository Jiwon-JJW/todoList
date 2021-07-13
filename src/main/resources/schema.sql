create database todo;

use todo;

create table user
(
    id    bigint auto_increment primary key,
    name  varchar(45),
    email varchar(255)
);


create table category
(
    id      bigint auto_increment primary key,
    title   varchar(255),
    user_id bigint,
    foreign key (user_id) references user (id)
);

create table card
(
    id           bigint auto_increment primary key,
    title        varchar(255),
    description  varchar(1000),
    status       tinyint(1),
    due_date     datetime,
    created_date datetime,
    category_id  bigint,
    user_id      bigint,
    foreign key (category_id) references category (id),
    foreign key (user_id) references user (id)
);
