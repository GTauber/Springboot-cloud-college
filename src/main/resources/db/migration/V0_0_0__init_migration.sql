CREATE TABLE client (
    id           BIGINT PRIMARY KEY AUTO_INCREMENT,
    uuid         CHAR(36)     NOT NULL UNIQUE,
    version      BIGINT       NOT NULL,
    name         VARCHAR(255) NOT NULL,
    email        VARCHAR(255) NOT NULL,
    phone_number VARCHAR(20),
    created_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at   TIMESTAMP    NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);
