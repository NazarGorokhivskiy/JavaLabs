CREATE DATABASE `iot-test-db`;

USE `iot-test-db`;

CREATE TABLE `toy` (
  id int NOT NULL PRIMARY KEY,
  age varchar(255) NOT NULL,
  price double(20,0),
  size varchar(255)
);ULT CHARSET=utf8;