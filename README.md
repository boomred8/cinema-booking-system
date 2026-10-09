# Cinema Booking System

---

### Project Description

This is a simple console application for booking movie tickets.

The user can:

- Register
- Log in
- View available movies
- Book a ticket
- Make a payment
- View booking history

The project was created using OOP principles in Java.

---

### Project Structure

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

### OOP Concepts Used

#### Encapsulation

Private fields with public getters.

Example:

```java
private String username;
private String password;
```

---

#### Inheritance

```java
Customer extends User
Admin extends User
```

---

#### Abstraction

```java
public abstract class User
```

---

#### Polymorphism

```java
User user = authService.login(...);
```

---

#### Method Overriding

```java
@Override
public void showRole()
```

---

### Additional Concepts

- Association
- Aggregation
- Composition
- Dependency
- Custom Exception
- Scanner
- ArrayList

---

### How To Run

1. Open the project in IntelliJ IDEA.
2. Create the folders:

```text
models
services
exceptions
```

3. Add all Java files to their corresponding packages.
4. Run:

```java
Main.java
```

---

### Test Scenario

#### Register

Example:

```text
Register login: test
Register password: 123
```

---

#### Login

Example:

```text
Login: test
Password: 123
```

Expected result:

```text
Authorization successful!
```

---

#### Show Movies

Menu:

```text
1. Show movies
2. Book ticket
3. My bookings
4. Exit
```

Choose:

```text
1
```

Expected result:

```text
1. Avatar
2. Batman
3. Interstellar
```

---

#### Book Ticket

Choose:

```text
2
```

Example:

```text
Choose movie: 1
Choose seat: 5
```

Expected result:

```text
Payment successful: 3000.0
Ticket booked successfully!
```

---

#### View Booking History

Choose:

```text
3
```

Expected result:

```text
Movie: Avatar
Hall: 1
Seat: 5
Price: 3000.0
```

---

### Exception Testing

Choose a movie that does not exist:

```text
Choose movie: 99
```

Expected result:

```text
Movie not found
```

---

Choose an invalid seat:

```text
Choose seat: -1
```

Expected result:

```text
Invalid seat
```

---

### Conclusion

The application demonstrates the use of Java OOP concepts, package organization, exception handling, user authorization, and ticket booking functionality in a simple console-based cinema management system.