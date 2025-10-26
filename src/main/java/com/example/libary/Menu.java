package com.example.library;


import com.example.library.dao.BookDAO;
import com.example.library.model.Book;


import java.util.List;
import java.util.Scanner;


public class Menu {
private final BookDAO dao = new BookDAO();
private final Scanner scanner = new Scanner(System.in);


public void start() {
boolean running = true;
while (running) {
printMenu();
String choice = scanner.nextLine().trim();
switch (choice) {
case "1" -> addBook();
case "2" -> listBooks();
case "3" -> editBook();
case "4" -> deleteBook();
case "5" -> searchBooks();
case "6" -> running = false;
default -> System.out.println("Nieznana opcja. Spróbuj ponownie.");
}
}
System.out.println("Do widzenia!");
}


private void printMenu() {
System.out.println("\n=== Library Management ===");
System.out.