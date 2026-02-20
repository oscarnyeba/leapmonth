# Leap Month Checker — Java Program

## Overview
This is a simple Java program that checks whether a given month is a **Leap Month** based on the following boolean logic:

- Divisible by **4**, but **not** by **100**
- **OR** divisible by **400**

The program was developed as part of an Object-Oriented Programming (OOP) assignment and demonstrates the use of classes, constructors, methods, boolean expressions, and user input in Java.

---

## Project Structure

```
oscar/
└── leapmonth/
    └── leapmonth.java
```

---

## Class Details

**Class Name:** `leapmonth`  
**Package:** `oscar.leapmonth`  

### Variables
| Variable | Type | Description |
|---|---|---|
| `month` | `int` | Stores the month entered by the user |
| `isLeapMonth` | `boolean` | Stores the result of the leap month check |

### Methods
| Method | Description |
|---|---|
| `leapmonth(int month)` | Constructor — initializes the month and sets `isLeapMonth` to false |
| `checkLeapMonth()` | Applies boolean logic to determine if the month is a leap month and prints the result |
| `main(String[] args)` | Entry point — reads user input and calls `checkLeapMonth()` |

---

## Boolean Logic Used

```java
isLeapMonth = (month % 4 == 0);
isLeapMonth = isLeapMonth && (month % 100 != 0);
isLeapMonth = isLeapMonth || (month % 400 == 0);
```

---

## How to Run

### Prerequisites
- Java Development Kit (JDK) installed
- A terminal or an IDE such as NetBeans, IntelliJ IDEA, or Eclipse

### Steps

1. **Clone or download** the project files.

2. **Navigate** to the project directory:
   ```bash
   cd path/to/project
   ```

3. **Compile** the program:
   ```bash
   javac oscar/leapmonth/leapmonth.java
   ```

4. **Run** the program:
   ```bash
   java oscar.leapmonth.leapmonth
   ```

5. **Enter a month** when prompted:
   ```
   Enter a month to check: 4
   ```

---

## Sample Output

```
Enter a month to check: 4
4 is a Leap Month.

Enter a month to check: 3
3 is NOT a Leap Month.
```

---

## Author
**Oscar**  
OOP Java Assignment  
Package: `oscar.leapmonth`

---

## Notes
- The class name `leapmonth` follows the naming convention used in the assignment. In standard Java convention, class names should begin with an uppercase letter (e.g., `LeapMonth`).
- The leap month logic is based on the classic leap year divisibility algorithm, applied to month values as specified in the assignment question.
