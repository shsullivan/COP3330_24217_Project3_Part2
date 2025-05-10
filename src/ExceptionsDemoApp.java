/*
Name: Shawn Sullivan
Course: COP 3330C-24217
Date: 09-FEB-2025
Problem Description:
Step 1. Choose at least two rules or a username and two for a password
Step 2. Create a Java class named name PasswordVerifyException that extends Exception. The constructor for this class
should accept 2 parameters; the username and password strings.
Step 3. Implement another Java class called PasswordVerify. It should have the same fields as the exception class and
the constructor should require both fields. The constructor should throw an exception if the username or password
violates ANY of the rules chosen in Step 1. Display a clear message  to the user to let them know which username or
password rule was broken.
Step 4. In the third class write an application that will demonstrate the use of throwing and catching custom
exceptions. In the main method create an array of size 4 PasswordVerify objects and loop through the following tasks
    1. Display the username and password rules to the user.
    2. Ask the user for a username, and collect it.
    3. Ask the user for a password, and collect it.
    4. Attempt to create a new PasswordVerify object.
        - If the username or password is invalid, the custom exception should be thrown and caught and an error message
        will display to the user.
        - If the username and password are both valid, add the new object to your array.
    5. After 4 valid usernames/passwords have been added to the array, exit the loop and print the array.
    6. Exit the program.
 */

import java.util.Scanner;

public class ExceptionsDemoApp {
    public static void main(String[] args) {

        // Instantiate a scanner to catch and store user inputs
        Scanner scanner = new Scanner(System.in);

        // Store number of usernames and passwords to be collected in a variable
        int count = 4;

        // Temporary fields for storing user entries
        String username;
        String password;

        // Array for holding PasswordVerify objects
        PasswordVerify[] entries = new PasswordVerify[count]; // for storing entries and looping

        for (int i = 0 ; i < count ; i++) {
            try {

                // Display username and password rules to the user and prompt entry of both
                System.out.println("Please enter your username and password below. Note that usernames must be " +
                        "between 5 and 10 characters long, and passwords must not contain \"bama\" or \"tide\".");

                // Collect username
                System.out.print("Username: ");
                username = scanner.nextLine();

                // Collect password
                System.out.print("Password: ");
                password = scanner.nextLine();

                // Attempt to instantiate PasswordVerify object and add it to the array
                entries[i] = new PasswordVerify(username, password);
            }// End of try block

            catch (PasswordVerifyException e) {
                // Print exception message to screen
                System.out.println(e.getMessage());
                // Decrement index so that user can try again at same index
                i--;

            }// End of catch PasswordVerifyException
        }// End of for loop

        // Print out usernames and passwords entered once for loop is exited
        for (PasswordVerify entry : entries) {
            System.out.println(entry);
        }// end of Print for loop
    }// End of main method
}// End of ExceptionsDemoApp Class
