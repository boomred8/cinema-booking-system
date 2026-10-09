# Cinema Booking System

---

### Описание проекта

Данный проект представляет собой простую консольную систему бронирования билетов в кинотеатр.

Пользователь может:

- Зарегистрироваться
- Авторизоваться
- Посмотреть список фильмов
- Забронировать билет
- Выполнить оплату
- Посмотреть историю своих бронирований

Проект написан на Java с использованием принципов ООП.

---

### Структура проекта

```text
src
│
├── Main.java
│
├── models
│   ├── User.java
│   ├── Customer.java
│   ├── Admin.java
│   ├── Movie.java
│   ├── Cinema.java
│   ├── Hall.java
│   ├── Seat.java
│   ├── Ticket.java
│   ├── Booking.java
│   └── Payment.java
│
├── services
│   ├── AuthService.java
│   └── BookingService.java
│
└── exceptions
    └── CustomException.java
```

---

### Что используется в проекте

#### Инкапсуляция

Поля классов сделаны `private`, доступ к ним происходит через методы.

Пример:

```java
private String username;
private String password;
```

---

#### Наследование

Классы:

```java
Customer extends User
Admin extends User
```

наследуются от общего класса User.

---

#### Абстракция

Используется абстрактный класс:

```java
public abstract class User
```

---

#### Полиморфизм

Пример:

```java
User user = authService.login(...);
```

---

#### Переопределение методов (Override)

Пример:

```java
@Override
public void showRole()
```

---

### Дополнительно используются

- Scanner
- ArrayList
- Исключения (Exception)
- Ассоциация
- Агрегация
- Композиция
- Зависимость

---

### Как запустить проект

1. Открыть проект в IntelliJ IDEA.
2. Создать пакеты:

```text
models
services
exceptions
```

3. Добавить все классы в соответствующие пакеты.
4. Запустить файл:

```java
Main.java
```

---

### Как проверить работу программы

После запуска программа попросит зарегистрироваться.

Пример:

```text
Register login: ali
Register password: 123
```

После этого нужно авторизоваться.

Пример:

```text
Login: ali
Password: 123
```

Если данные введены правильно, появится сообщение:

```text
Authorization successful!
```

---

### Главное меню

После входа доступно меню:

```text
1. Show movies
2. Book ticket
3. My bookings
4. Exit
```

---

### Проверка списка фильмов

Выбрать:

```text
1
```

Ожидаемый результат:

```text
1. Avatar
2. Batman
3. Interstellar
```

---

### Проверка бронирования

Выбрать:

```text
2
```

Далее:

```text
Choose movie: 1
Choose seat: 5
```

Ожидаемый результат:

```text
Payment successful: 3000.0
Ticket booked successfully!
```

---

### Проверка истории бронирований

Выбрать:

```text
3
```

Ожидаемый результат:

```text
Movie: Avatar
Hall: 1
Seat: 5
Price: 3000.0
```

---

### Проверка обработки ошибок

Попробовать выбрать фильм, которого нет:

```text
Choose movie: 99
```

Результат:

```text
Movie not found
```

---

Попробовать указать неверное место:

```text
Choose seat: -1
```

Результат:

```text
Invalid seat
```

---

### Вывод

Проект демонстрирует работу основных принципов ООП в Java, работу с пакетами, обработку исключений, авторизацию пользователей и систему бронирования билетов через консольное приложение.