package com.student.helloworld;

import java.util.Scanner;

public class Main {
    private static final String[] GREETINGS = {
        "Hello", "Hola", "Bonjour", "Hallo", "Ciao"
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine().trim();
        if (name.isEmpty()) name = "World";
        
        System.out.println("Available languages:");
        for (int i = 0; i < GREETINGS.length; i++) {
            System.out.println((i + 1) + ". " + GREETINGS[i]);
        }
        
        System.out.print("Choose language (1-5): ");
        int choice = scanner.nextInt();
        
        if (choice >= 1 && choice <= GREETINGS.length) {
            System.out.println(GREETINGS[choice - 1] + ", " + name + "!");
        } else {
            System.out.println("Hello, " + name + "!");
        }
        
        scanner.close();
    }
}

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

