# FUEL

---

**Date:** 14/03/2025

# Core Java Basics

## Java Overview

1. **Platform Independence**: Write once, run anywhere (WORA).
2. **Object-Oriented**: Follows principles like encapsulation, inheritance, polymorphism, and abstraction.
3. **Robust**: Includes strong memory management and exception handling.
4. **Portable**: Programs written in Java can run on different hardware environments.

---

**Date:** 15/03/2025

## Data Types

1. **Primitive Data Types**:
  - `byte`, `short`, `int`, `long` – for integers.
  - `float`, `double` – for decimal values.
  - `char` – for characters.
  - `boolean` – for `true` or `false`.

2. **Non-Primitive Data Types**:
  - Strings, Arrays, Classes, and Interfaces.

### Example: Primitive vs. Non-Primitive

```java:
int number = 25; // Primitive
String text = "Hello, Java!"; // Non-Primitive
```

---

**Date:** 16/03/2025

## Control Statements

1. **Decision-Making Statements**:
  - `if`, `if-else`, `switch`

2. **Looping Statements**:
  - `for`, `while`, `do-while`

3. **Jumping Statements**:
  - `break`, `continue`

### Example: Using a Loop

```java:
for (int i = 1; i <= 5; i++) {
    System.out.println("Count: " + i);
}
```

---

**Date:** 17/03/2025

## Classes and Objects

1. **Class**: A blueprint for creating objects.
2. **Object**: An instance of a class.

### Syntax: Creating a Class and Object

```java
class Example {
    int value = 10; // Data member

    void display() { // Member function
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(); // Creating an object
        obj.display(); // Accessing a method
    }
}
```

---

**Date:** 18/03/2025

## Constructors

1. **Definition**: A block of code used to initialize objects.
2. **Characteristics**:
  - Same name as the class.
  - No return type, not even `void`.

1. **Types of Constructors**:
  - Default Constructor.
  - Parameterized Constructor.

### Example: Parameterized Constructor

```java:
class Example {
    int value;

    Example(int value) { // Constructor
        this.value = value;
    }

    void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example(100); // Passing value to constructor
        obj.display();
    }
}
```

---

**Date:** 19/03/2025

## Access Modifiers

1. **Public**: Accessible from anywhere.
2. **Private**: Accessible only within the same class.
3. **Protected**: Accessible within the same package or by subclasses.
4. **Default**: Accessible only within the same package (no keyword required).

### Example: Using Access Modifiers

```java
class Example {
    private int value = 10;

    public void display() {
        System.out.println("Value: " + value);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.display();
    }
}
```

---

**Date:** 11/02/2025

## Overview
A banking system utilizing **encapsulation**, with the following data members:

- **Balance**
- **Account Number**
- **Withdrawal Amount**
- **Deposit Amount**

### Validation Rules
- If a user attempts to withdraw an amount **greater** than their balance, display:
    - **"Insufficient Balance"**
- If the balance is **sufficient**, deduct the withdrawal amount and display the remaining balance.

---

## Method Binding

## Polymorphism
Polymorphism refers to the ability of a method to take multiple forms, allowing different behaviors based on the object invoking it.

### Types of Polymorphism

#### 1. Compile-Time Polymorphism
- Achieved through **method overloading**.
- Also known as **early binding** or **static binding**.
- The method to be executed is determined **at compile time** by the compiler.

#### 2. Run-Time Polymorphism
- Achieved through **method overriding**.
- Also known as **late binding** or **dynamic binding**.
- The method to be executed is determined **at runtime** by the JVM.

---

**Date:** 12/03/2025

## Abstraction
Abstraction is the process of hiding implementation details while exposing only essential functionalities to the user. This is achieved using **abstract classes** or **interfaces**.

### Key Concepts of Abstraction
1. **Abstract class or interface** is required for abstraction.
2. Uses an **"is-a" relationship** (Inheritance).
3. Utilizes **method overriding**.
4. Supports **upcasting**.

### Important Notes:
- An **abstract class** cannot be instantiated.
- An **abstract method** cannot be **private**, **static**, or **final**.

### Abstract Concepts
- `abstract` is a **keyword** used with classes and methods.
- A class **without** the `abstract` keyword is called a **concrete class**.
- A **concrete class** can contain **only concrete methods**.
- A class **with** the `abstract` keyword is called an **abstract class**.
- **Abstract classes** can contain both **abstract and concrete methods**.
- A **concrete method** includes both **declaration and implementation**.
- An **abstract method** has **only a declaration** and **no implementation**.
- All abstract methods **must** be declared using the `abstract` keyword.

### Additional Notes:
- A class that **inherits** an abstract class must **override all** the abstract methods.
- If a class **inherits** an abstract class but does **not** override its abstract methods, it must be declared as an **abstract class** itself.

---

### Task:

**Question:**
Develop an abstract class with a minimum of five abstract methods:

```java
abstract class Example {
    abstract void Work();
    abstract void Information();
    abstract void Develop();
    abstract void Creation();
    abstract void Update();
}

class ConcreteExample extends Example {
    void Work() {
        System.out.println("Working...");
    }
    void Information() {
        System.out.println("Displaying Information...");
    }
    void Develop() {
        System.out.println("Developing...");
    }
    void Creation() {
        System.out.println("Creating...");
    }
    void Update() {
        System.out.println("Updating...");
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new ConcreteExample();
        obj.Work();
        obj.Information();
        obj.Develop();
        obj.Creation();
        obj.Update();
    }
}
```

---

**Date:** 13/03/2025

## Interface
- Interface is a java type definition which has to be declared using interface keyword.
- Interface is a media between two systems where in one system is a client/user and another system is Object with resource and service.
- Interface can have variables, those variables are automatically public, static and final.
- Interface can allow only abstract methods and those methods are automatically public and abstract.
- Classes can achieve ```is-a relationship``` with an interface using ```implements``` keyword.
- When a class implements an interface mandatory override abstract method.
- While overriding a method access specifier/modifier should be same or higher visibility.
- A class can implements any number of interfaces.
- A class can extend one class and implement any number of interface.
- It does not contain constructor.
- We cannot create Object on interface.

### ![img.png](Img-Files/img.png)

### ![img.png](Img-Files/img1.png)


**Date: 14/03/2025**

## Exception Handling

1. Exception is an event or interpretation which stop the execution of a program it is called as an Exception.
2. In other words exception is a runtime interpretation which cannot be handled.
3. Errors can occur during:
   1. Compile Error - Syntax Error
   2. Runtime Error - Execution
4. The process of handling an exception is called as Exception Handling.
5. Typically, an exception is handled using ```Try Block & Catch Block.```

### Try Block & Catch Block
1. The critical line of code which gives and exception should be written inside the ```try block```.
2. If there is a try block, mandatory catch block should be present or vice versa.
3. The solution should always be written within the catch block.
4. catch block will be executed if an Exception occur.

*Syntax:*
```
try {
    // Code that might throw an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}
```

### Java Exception Hierarchy

## Throwable (Root Class)
- **Exception** (Checked)
  - **IOException**
    - FileNotFoundException
    - EOFException
    - SocketException
  - **SQLException**
  - **ClassNotFoundException**
  - **InterruptedException**
  - **ReflectiveOperationException**
  - **RuntimeException** (Unchecked)
    - ArithmeticException
    - NullPointerException
    - ClassCastException
    - IndexOutOfBoundsException
      - ArrayIndexOutOfBoundsException
      - StringIndexOutOfBoundsException
    - IllegalArgumentException
      - NumberFormatException
    - UnsupportedOperationException
    - ConcurrentModificationException
- **Error** (Unchecked, Critical)
  - **OutOfMemoryError**
  - **StackOverflowError**
  - **VirtualMachineError**
  - **AssertionError**
  - **LinkageError**
    - ClassNotFoundError
    - NoClassDefFoundError



  
