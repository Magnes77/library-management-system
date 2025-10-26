# 📚 Library Management System (Java + SQLite)

A simple console-based Library Management System built using **Java** and **SQLite**.  
It allows users to **add, edit, delete, and display** books from a database.  
This project demonstrates the use of JDBC for database connectivity and basic CRUD operations.

---

## 🚀 Features

- ➕ Add a new book  
- ✏️ Edit existing book information  
- ❌ Delete a book  
- 📖 Display all books  
- 💾 Data persistence using SQLite  

---

## 🛠️ Technologies Used

- **Java 17**
- **SQLite**
- **JDBC**
- **Maven**

---

## 📂 Project Structure
library-management-system/
├─ .gitignore
├─ pom.xml
├─ README.md
├─ library.db 
└─ src/
└─ main/
└─ java/
└─ com/example/library/
├─ Main.java
├─ Menu.java
├─ model/
│ └─ Book.java
├─ db/
│ └─ Database.java
└─ dao/
└─ BookDAO.java

---

## ⚙️ How to Run

1. **Clone the repository**
   ```bash
   git clone https://github.com/Magnes77/library-management-system.git   
2. Open the project in IntelliJ IDEA or VS Code (with Java support).
3. Build the project using Maven
mvn clean compile
4. Run the program
mvn exec:java -Dexec.mainClass="com.example.library.Main"

## 🧠 Example Screenshots

MAIN MENU
<img width="305" height="173" alt="image" src="https://github.com/user-attachments/assets/77e2fd05-e772-4256-88a0-1d50a3e3b488" />


## 🧩 Database

The project uses a local SQLite database file (library.db).
If it doesn’t exist, it will be automatically created on the first run.


## 📈 Future Improvements

Add a GUI (JavaFX)

Add search and sorting options

Connect to a remote SQL database (e.g., PostgreSQL)


## 👨‍💻 Author

Wiktor - "Magnes77"
💼 IT student passionate about Java development and backend technologies.
📧 Contact: [wiktorcieplinski01@gmail.com]

🌍 GitHub: https://github.com/Magnes77



