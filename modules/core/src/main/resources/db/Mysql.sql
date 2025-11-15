--# Create data for t_user
USE xiaopang;

DELETE FROM t_user;

INSERT t_user(username, PASSWORD, birthday) VALUES ('Mike', '122', '1990-1-3');
INSERT t_user(username, PASSWORD, birthday) VALUES ('Zhangshan', '122', '1991-10-3');
INSERT t_user(username, PASSWORD, birthday) VALUES ('Lisi', '122', '1987-4-3');
INSERT t_user(username, PASSWORD, birthday) VALUES ('Laowang', '122', '1990-9-3');

SELECT * FROM t_user

--# Create data for t_order
USE xiaopang;

DELETE FROM t_order;

INSERT INTO t_order(`id`, `order_time`, `total`, `uid`) VALUES (uuid(), NOW(), '2', 'e7eb3ee5-c1b3-11f0-9e83-38f3ab2b42fb');
INSERT INTO t_order(`id`, `order_time`, `total`, `uid`) VALUES (uuid(), now(), '21', 'e7eb3ee5-c1b3-11f0-9e83-38f3ab2b42fb');
INSERT INTO t_order(`id`, `order_time`, `total`, `uid`) VALUES (uuid(), now(), '200', 'e7ebc350-c1b3-11f0-9e83-38f3ab2b42fb');


SELECT * FROM t_order