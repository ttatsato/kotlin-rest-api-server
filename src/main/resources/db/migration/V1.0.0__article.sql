CREATE TABLE article(
  article_id SERIAL,
  title TEXT NOT NULL,
  content TEXT NOT NULL,
  create_at timestamp NOT NULL,
  modified_at timestamp NOT NULL,
  PRIMARY KEY (article_id)
);