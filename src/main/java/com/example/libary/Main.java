package com.example.library;

import com.example.library.db.Database;

public class Main {
    public static void main(String[] args) {
        Database.initDatabase();
        Menu menu = new Menu();
        menu.start();
    }
}
