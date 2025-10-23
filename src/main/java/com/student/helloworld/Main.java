package com.student.helloworld;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        scanner.close();
    }
}package com.student.helloworld;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

