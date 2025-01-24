# Design Patterns in Java

This repository demonstrates the implementation of various design patterns in Java. Below are the design patterns covered:

---

## 1. Singleton Pattern
- **Purpose**: Ensures that only one instance of a class is created and provides a global point of access to it.
- **Implementation**: 
  - A `Singleton` class restricts instantiation and provides a static method to retrieve the single instance.
- **Use Case**: Suitable for managing shared resources such as database connections or configuration settings.

---

## 2. Factory Method Pattern
- **Purpose**: Provides a way to create objects without specifying their exact class.
- **Implementation**: 
  - The `NotificationFactory` class is used to create `SMSNotification` objects or other types of notifications dynamically.
- **Use Case**: Ideal for scenarios where the type of object to be created is determined at runtime.

---

## 3. Abstract Factory Pattern
- **Purpose**: Provides an interface for creating families of related or dependent objects without specifying their concrete classes.
- **Implementation**: 
  - `GUIFactory` and `LightThemeFactory` are used to create platform-specific `Button` objects.
- **Use Case**: Used in GUI applications to create theme-dependent components such as buttons and text fields.

---

## 4. Builder Pattern
- **Purpose**: Facilitates the step-by-step construction of a complex object.
- **Implementation**: 
  - The `FoodOrder` class enables the creation of food orders with various components (e.g., main course, side dish, drink).
- **Use Case**: Useful for creating objects with numerous optional parameters or configurations.

---

## 5. Prototype Pattern
- **Purpose**: Enables creating duplicate objects while keeping performance in mind.
- **Implementation**: 
  - The `Document` class implements `Cloneable`, allowing the cloning of document instances.
- **Use Case**: Suitable for scenarios where creating a new object is resource-intensive and cloning an existing object is more efficient.

---

## How to Run
1. Clone the repository:
   ```bash
   git clone <repository-url>
