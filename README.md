<h2 align="center">Тестовое приложение</h2>

Web приложение которое на вход получат массив чисел, на выходе возвращает индекс максимального значения из этого массива.

#### Как запускать
`mvn package` что бы собрать приложение  
`java -jar target\spring-boot-test-application.jar` что бы запустить jar файл  
есть возможность запустить в docker  
`docker build -f Dockerfile -t spring-boot-test-application .`  собрать образ из Dockerfile  
`docker run -p 80:8080 spring-boot-test-application`   запустить контейнер

#### Как использовать
Любым удобным способом послать HTTP GET запрос на 

`http://localhost/maxIndex?values=-10,5,20,30`  

Значения массива передаются в параметре values через запятую. В ответ получаем json вида  
`{"result":3}`  

Попробовать можно попосылать на установленное приложение в интернете

<a href='http://ec2-18-222-159-55.us-east-2.compute.amazonaws.com:8080/maxIndex?values=-10,5,20,30'/>http://ec2-18-222-159-55.us-east-2.compute.amazonaws.com:8080/maxIndex?values=-10,5,20,30</a>

<p align="center"><img src="http://nerdist.com/wp-content/uploads/2016/07/ToiletMachine_GIF.gif" alt="have a fun"></p>