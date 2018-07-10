DROP DATABASE IF EXISTS MacrotisOrientationExam;

CREATE DATABASE MacrotisOrientationExam;

USE MacrotisOrientationExam;

CREATE TABLE attractions (
    id INT NOT NULL AUTO_INCREMENT,
    attr_name VARCHAR(80),
    city VARCHAR(30),
    category VARCHAR(30),
    price INT,
    longitude FLOAT,
    lattitude FLOAT,
    recommended_age FLOAT,
    duration INT,
    PRIMARY KEY (id));

INSERT INTO attractions(attr_name, city, category, price, longitude, lattitude, recommended_age, duration)
VALUES ('Kerkyra', 'Budapest', 'restaurant', 1800, 47.484174, 19.060234, 3, 60),
       ('House of Terror', 'Budapest', 'museum', 3000, 47.484110, 19.060172, 3, 120),
       ('Pulitzer', 'Budapest', 'restaurant', 1200, 47.48407, 19.060181, 3, 60),
       ('Heroes'' Square', 'Budapest', 'park', 0, 47.484110, 19.060100, 3, 30),
       ('Budapest Zoo and Botanical Garden', 'Budapest', 'park', 4000, 47.484090, 19.060100, 3, 180);
