CREATE TABLE IF NOT EXISTS admins (
  id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  email varchar(128) NOT NULL,
  password varchar(64) NOT NULL,
  username varchar(128) NOT NULL,
  UNIQUE KEY email (email)
);