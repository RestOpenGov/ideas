# --- First database schema

# --- !Ups

DROP TABLE IF EXISTS vote;

CREATE TABLE vote (
  id              int(11)        NOT NULL AUTO_INCREMENT,
  vote_type       varchar(100)   NOT NULL,
  idea_id         int(11)        NULL,
  comment_id      int(11)        NULL,
  user_id         int(11)        NOT NULL,
  pos             boolean        NOT NULL,

  PRIMARY KEY (id)
);

ALTER TABLE vote 
ADD FOREIGN KEY (idea_id) 
REFERENCES idea(id);

ALTER TABLE vote 
ADD FOREIGN KEY (comment_id) 
REFERENCES comment(id);

ALTER TABLE vote 
ADD FOREIGN KEY (user_id) 
REFERENCES user(id);

# --- !Downs

DROP TABLE IF EXISTS vote;