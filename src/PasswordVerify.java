/*
Class: PasswordVerify
This class accepts the chosen username and password from the user then uses if statements to validate the entries.
If either of the entries fails validation an exception with a custom message is thrown.
 */

public class PasswordVerify {

    // Fields
    private String username;
    private String password;

    // Constructors
    public PasswordVerify(String username, String password) throws PasswordVerifyException {
        this.username = username;
        this.password = password;

        // Validate that username is between 5 and 10 characters
        if (username.length() > 10 || username.length() < 5 ) {
            throw new PasswordVerifyException(username, password, "Username must be 5 to 10 characters" +
                    " in length.");
        }// End of if

        // Validate that password does not contain the character sequence "bama" or "tide"
        else if (password.toLowerCase().contains("bama") || password.toLowerCase().contains("tide")) {
            throw new PasswordVerifyException(username, password, "Password must not contain \"bama\" or \"tide.\"");
        }// End  of else if
    }// End of PasswordVerify constructor

    // Override toString() to print object information when called
    @Override
    public String toString() {
        return "Username: " + username + ", Password: " + password + "\n" +
                "-------------------------------------------------";
    }
}// End of PasswordVerify Class
