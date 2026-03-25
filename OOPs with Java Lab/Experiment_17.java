// Name = Akshat Rastogi
// Class = CSE 11
// Roll No. = 2400320100133

// Write a Java program to read username and password using Console class in such a way 
// that the password is hidden while typing and then display the entered username and password.

import java.io.Console;

public class Experiment_17 {
    public static void main(String[] args) {
        
        Console console = System.console();

        String username = console.readLine("Enter username: ");

        char[] passwordArray = console.readPassword("Enter password: ");

        String password = new String(passwordArray);

        System.out.println("\n--- Login Details ---");
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
/*
    OUTPUT
    
    Enter username: Akshat Rastogi
    Enter password: 

    --- Login Details ---
    Username: Akshat Rastogi
    Password: 123@456
*/