# 🧑‍💻 Task S1.05. Java Utils
**Author:** David Rey  
**Corrected by:** 

## 📄 Description  
This project focuses on **file and directory handling in Java**, including listing directories, recursive traversal, file metadata, reading/writing text files, and object serialization. The exercises are organized by difficulty level.

---

### 🔹 Level 1  

**Exercise 1 – Alphabetical Directory Listing**  
- Create a class that lists alphabetically the content of a directory received as a parameter.  

**Execution:**  
```bash
javac src/level1/ex1/*.java
java src/level1/ex1/Main.java
```

---

**Exercise 2 – Recursive Directory Tree**  
- Extend the previous class to list a directory tree recursively, showing all levels.  
- Print the content alphabetically within each level.  
- Indicate whether each element is a directory `(D)` or a file `(F)`.  
- Display the last modification date of each element.  

**Execution:**  
```bash
javac src/level1/ex2/*.java
java src/level1/ex2/Main.java
```

---

**Exercise 3 & 4 – Save Directory Tree to TXT and Read TXT File**  
- Modify the previous exercise so that instead of printing the result to the console, it saves the output to a `.txt` file.  
- Add functionality to read any `.txt` file and display its content on the console.  
- ✅ Note: Exercises 3 and 4 have been merged into a single implementation.  

**Execution:**  
```bash
javac src/level1/ex3/*.java
java src/level1/ex2/Main.java
```

---

**Exercise 5 – Object Serialization**  
- Implement functionality to serialize a Java object into a `.ser` file.  
- Deserialize the object back and verify its integrity.  

**Execution:**  
```bash
javac src/level1/ex4/*.java
java src/level1/ex2/Main.java
```

---

## 💻 Technologies Used  
- Java SE 24  
- IntelliJ IDEA as the development environment  
- Git & GitHub for version control  
- JDK for compiling and running the code  
- Java I/O API:  
  - `File`, `FileReader`, `FileWriter`  
  - `BufferedReader`, `BufferedWriter`  
  - `ObjectOutputStream`, `ObjectInputStream`  
- Collections and sorting for alphabetical ordering  
- Serialization and deserialization of Java objects  

---

## 📋 Requirements  
- Java Development Kit (JDK) 24 or higher  
- IntelliJ IDEA or any Java-compatible IDE  
- Git installed to clone the repository  
- Basic knowledge of Java I/O and serialization  

---

## 🛠️ Installation  
- Clone the repository:  
```bash
git clone https://github.com/Viid21/S1_08_Java_File_Management.git
