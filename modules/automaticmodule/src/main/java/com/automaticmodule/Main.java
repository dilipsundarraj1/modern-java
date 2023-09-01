package com.automaticmodule;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("I am from automatic Module");
        System.out.println(Main.class.getModule().getName());
    }
}