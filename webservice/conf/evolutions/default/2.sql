# --- First database schema

# --- !Ups

INSERT INTO `user` VALUES
  (1, 'nardoz',     'Mister Nardoz',      'nardoz@hotmail.com',   'http://profile.ak.fbcdn.net/hprofile-ak-ash4/276893_244434932260649_848703319_n.jpg', '', '1970-01-01', '2012-09-23 11:45:00'),
  (2, 'opensas',    'Sebastian Scarano',  'scarano@hotmail.com',  'http://a0.twimg.com/profile_images/1557699557/penguin_armed_normal.jpg',              'opensas', '2014-01-01', '2012-09-22 10:40:00'),
  (3, 'darkipunch', 'Mister dark punch',  'darki@hotmail.com',    'https://twimg0-a.akamaihd.net/profile_images/1157351292/IMG_2299_normal.JPG',         '', '1970-01-01', '2012-09-24 18:50:00'),
  (4, 'pala',       'Mister paladin',     'pala@hotmail.com',     'https://twimg0-a.akamaihd.net/profile_images/1644119490/pala-rafting_normal.png',     '', '1970-01-01', '2012-09-25 21:30:00'),
  (5, 'Nicolas',    'Nicolas Melendez',   'nfmelendez@gmail.com', 'http://profile.ak.fbcdn.net/hprofile-ak-ash4/276893_244434932260649_848703319_n.jpg', '', '1970-01-01', '2012-10-20 11:45:00')
;
# --- !Downs

delete from `user` where id > 0;