# 🔐 Login System with Brute-Force Detection

This is a simple Java-based console application that implements a secure login system. It detects brute-force login attempts and locks the user account after three failed attempts. All login activities are logged with timestamps.

---

## ✅ Features

- User authentication using username and password  
- Brute-force detection and automatic account lock after 3 failed attempts  
- Login attempt logging with timestamp (`login_attempts.log`)  
- Clean and modular code (OOP-based)

---

## 🚀 How to Run

### 🖥️ Using Java Compiler (Terminal / CMD)
1. Navigate to the project directory:
   ```bash
   cd src
   ```
2. Compile the files:
   ```bash
   javac *.java
   ```
3. Run the application:
   ```bash
   java Main
   ```

---

### 📦 Using JAR File
If you have the JAR file (e.g. `LoginSystem.jar`):

```bash
java -jar LoginSystem.jar
```

---

## 📝 Log File

All login attempts are recorded in `login_attempts.log` with time, username, and result (SUCCESS/FAIL).

---

## 💡 Example Users

| Username | Password |
|----------|----------|
| alice    | 1234     |
| bob      | pass     |

---

## 👩‍💻 Created By

**Pragati**  
Java & DSA Based Project# LoginSystem
