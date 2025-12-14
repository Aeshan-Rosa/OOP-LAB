# 🧪 OOP Lab-Based Exam – Java Implementation

This repository contains my solutions for the **Object-Oriented Programming (OOP) Lab-Based Exam**, implemented using **Java**.  
The project demonstrates the correct application of **core OOP principles**, GUI development, and basic unit testing as required by the exam specification.

---

## 🎯 Exam Overview

The lab-based exam evaluates the following competencies:

- Object-Oriented Programming concepts
- Java class design and inheritance
- Encapsulation using getters and setters
- GUI development using Swing
- Event handling
- Sorting and collections
- Basic unit testing using JUnit

All tasks have been implemented according to the given exam instructions.

---

## 🧠 OOP Concepts Applied

This project demonstrates the use of:

- **Encapsulation** – Private fields with public getters and setters  
- **Inheritance** – Subclasses extending base classes (e.g., Book, DVD, Magazine → Item)  
- **Polymorphism** – Treating different item types uniformly through parent references  
- **Abstraction** – Use of interfaces where required  
- **Separation of Concerns** – Console logic, GUI logic, and data models are kept separate  

---

## 🛠️ Technologies Used

- **Java**
- **Java Swing** (GUI)
- **JUnit** (Unit Testing)
- **NetBeans IDE**
- **Collections Framework (ArrayList, Comparator, Collections.sort)**

---

## 📂 Project Structure

OOP-Lab-Based-Exam/
│
├── src/
│ └── librarycentre_package/
│ ├── Item.java
│ ├── Book.java
│ ├── DVD.java
│ ├── Magazine.java
│ ├── WestminsterLibraryManager.java
│ ├── ItemTableModel.java
│ ├── ItemTableGUI.java
│ └── LibraryManager.java
│
├── test/
│ └── WestminsterLibraryManagerTest.java
│
└── README.md

## 📌 Implemented Tasks Summary

### ✅ Task 01 – Class Creation & Inheritance
- Created new classes as required (e.g., `Magazine`)
- Implemented inheritance from the base `Item` class
- Added additional attributes and constructors

### ✅ Task 02 – Encapsulation
- Implemented getters and setters for all instance variables
- Followed proper access modifiers (`private`, `public`)

### ✅ Task 03 – Sorting & Display
- Sorted items using Java Collections
- Displayed items based on required criteria (e.g., publication year)

### ✅ Task 04 – GUI Table Enhancements
- Added additional columns to the GUI table
- Displayed item type (Book / DVD / Magazine)

### ✅ Task 05 – Event Handling
- Implemented button event handlers using `ActionListener`
- Displayed summary information using `JOptionPane`

### ✅ Task 06 – Unit Testing
- Created JUnit test class
- Tested key methods such as item addition logic

---

## 🧪 How to Run the Project

1. Open the project in **NetBeans**
2. Ensure JDK is properly configured
3. Run `WestminsterLibraryManager.java`
4. Use the console menu or GUI as instructed
5. To run tests:
   - Right-click the test file → **Run Test**


