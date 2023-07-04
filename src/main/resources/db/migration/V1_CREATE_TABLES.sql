create table hibernate_sequence
(
    next_val BIGINT
) engine = MyISAM;

INSERT into hibernate_sequence
VALUES (1);
INSERT into hibernate_sequence
VALUES (1);

CREATE TABLE user
(
    id       BIGINT      NOT NULL AUTO_INCREMENT,
    password VARCHAR(64) NOT NULL,
    username VARCHAR(64) NOT NULL unique,
    PRIMARY KEY (id)
) ENGINE = MyISAM;

CREATE TABLE todo
(
    id        BIGINT      NOT NULL AUTO_INCREMENT,
    title     VARCHAR(64) NOT NULL,
    completed BOOLEAN     NOT NULL,
    PRIMARY KEY (id)
) ENGINE = MyISAM;