package com.example.library.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Database {
private static final String URL = "jdbc:sqlite:library.db"; // plik w katalogu projektu


public static Connection getConnection() throws SQLException {
return DriverManager.getConnection(URL);
}


public static void initDatabase() {
String sql = "CREATE TABLE IF NOT EXISTS books ("
+ "id INTEGER PRIMARY KEY AUTOINCREMENT,"
+ "title TEXT NOT NULL,"
+ "author TEXT NOT NULL,"
+ "year INTEGER,")";
// Naprawka - poprawne zapytanie niżej
sql = "CREATE TABLE IF NOT EXISTS books ("
+ "id INTEGER PRIMARY KEY AUTOINCREMENT,"
+ "title TEXT NOT NULL,"
+ "author TEXT NOT NULL,"
+ "year INTEGER,"
+ "quantity INTEGER"
+ ")";


try (Connection conn = getConnection(); Statement stmt = conn.createStatement()) {
stmt.execute(sql);
} catch (SQLException e) {
System.err.println("Błąd inicjalizacji bazy: " + e.getMessage());
}
}
}