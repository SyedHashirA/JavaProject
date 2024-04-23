CREATE TABLE memory_game_scores (
  id INT AUTO_INCREMENT PRIMARY KEY,
  username VARCHAR(50) NOT NULL,
  level VARCHAR(50) NOT NULL,
  score INT NOT NULL,
  high_score INT NOT NULL,
  UNIQUE (username, level)
);