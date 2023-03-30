CREATE TABLE IF NOT EXISTS users (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    token VARCHAR(255),
    `password` VARCHAR(255),
    username VARCHAR(50),
    email VARCHAR(50),
    bio VARCHAR(255),
    image VARCHAR(255)
);