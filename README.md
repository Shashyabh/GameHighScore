# GameHighScore
In this I have created the controller 
Features

Register game

Register user
Submit high scores
List of 10 high scores by player
List of top 10 high score

Config file:
server.port=9999
spring.datasource.url=jdbc:mysql://localhost:3306/score?serverTimezone=UTC
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect



APIs

URL /addGame ,Method POST---> To add the game

URL highScores/{game_id}  ,Method GET---> to get top 10 high score by game id

URL /personalHighScore   ,Method GET---> to get top 10 high score personal
