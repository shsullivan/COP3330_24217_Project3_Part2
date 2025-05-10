/*
Class: PasswordVerifyException
PasswordVerifyException inherits from the Exception class. This allows us to write a custom message to be displayed
if the custom exception is thrown and caught.
*/

public class PasswordVerifyException extends Exception {

    // Fields
    private String username;
    private String password;
    private String message;

    // Constructor
    public PasswordVerifyException(String username, String password, String message) {
        this.message = message;
        this.username = username;
        this.password = password;
    }// End of PasswordVerifyException Constructor

    public String getUsername() {
        return username;
    }

    @Override
    public String getMessage() {
        return "Invalid username or password: " + message;
    }// end of Overridden getMessage
}// end of PasswordVerifyException
