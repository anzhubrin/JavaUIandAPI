<h2> Проект по автоматизации тестирования Swag Labs </h2>

### :green_book: *Содержание*
- *Технологии и инструменты*
- *Примеры автоматизированных тест кейсов*
- *Команды для запуска из терминала*
- *Allure отчёт*
- *Уведомление в Telegram при помощи Alert bot*
____

## :computer: *Технологии и инструменты*
<p align="center">  
<a href="https://www.jetbrains.com/idea/"><img src="images/Intelij_IDEA.svg" width="50" height="50"  alt="IDEA"/></a>  
<a href="https://www.java.com/"><img src="images/Java.svg" width="50" height="50"  alt="Java"/></a>  
<a href="https://github.com/"><img src="images/Github.svg" width="50" height="50"  alt="Github"/></a>  
<a href="https://junit.org/junit5/"><img src="images/JUnit5.svg" width="50" height="50"  alt="JUnit 5"/></a>  
<a href="https://gradle.org/"><img src="images/Gradle.svg" width="50" height="50"  alt="Gradle"/></a>  
<a href="https://selenide.org/"><img src="images/Selenide.svg" width="50" height="50"  alt="Selenide"/></a>  
<a href="https://aerokube.com/selenoid/"><img src="images/Selenoid.svg" width="50" height="50"  alt="Selenoid"/></a>  
<a href="https://github.com/allure-framework/allure2"><img src="images/Allure_Report.svg" width="50" height="50"  alt="Allure"/></a>  
<a href="https://www.jenkins.io/"><img src="images/Jenkins.svg" width="50" height="50"  alt="Jenkins"/></a>   
</p>

____

## *Примеры автоматизированных тест кейсов*
- :white_check_mark: Авторизация стандартного пользователя
- :white_check_mark: Авторизация заблокированного пользователя
- :white_check_mark: Авторизация глюченного пользователя
- :white_check_mark: Настройка сортировки товара по алфавиту
- :white_check_mark: Настройка сортировки товара по цене
- :white_check_mark: Добавление товара в корзину, удаление из корзины
- :white_check_mark: Переход из корзины к товару, обратно к покупкам или к оформлению заказа
- :white_check_mark: Полный путь покупки товара (выбор, добавление в корзину, оформление и оплата)

____

## :keyboard: *Команды для запуска из терминала*
***Локальный запуск:***
```bash  
gradle clean test
```

____

## <img src="images/Allure_Report.svg" width="25" height="25"  alt="Allure"/></a>*Интеграция с Allure TestOps*</a>
<image src="images/Allure.png" alt="Отчет Allure">
___

## <img src="images/Telegram.svg" width="25" height="25"  alt="Allure"/></a> *Уведомление в Telegram при помощи Alert bot*

<image src="images/Telegram.png" alt="Отчет в Telegram">

- Run for notifications in telegram:

```java "-DconfigFile=notifications/config.json" -jar notifications/allure-notifications-4.6.1.jar```

- Send msg to telegram from terminal:
```
 curl -X POST \
     -H 'Content-Type: application/json' \
     -d '{"chat_id": "YYY", "text": "ZZZ", "disable_notification": false}' \
     https://api.telegram.org/botXXX/sendMessage
```
___