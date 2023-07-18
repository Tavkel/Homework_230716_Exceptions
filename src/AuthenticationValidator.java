public class AuthenticationValidator {
    public static void validateAuthenticationData(String login, String password, String passwordConfirmation) throws WrongLoginException, WrongPasswordException{
        validateLogin(login);
        validatePassword(password, passwordConfirmation);
    }

    private static void validateLogin(String login) throws WrongLoginException{
        if(login.length() > 20 || !login.matches("^\\w*$")){
            throw new WrongLoginException("Login does not meet requirements!");
        }
    }

    private static void validatePassword(String password, String passwordConfirmation) throws WrongPasswordException{
        if (password.length() > 20 || !password.matches("^\\w*$")){
            throw new WrongPasswordException("Password does not meet requirements");
        }
        if (!password.equals(passwordConfirmation)){
            throw new WrongPasswordException("Password does not meet requirements");
        }
    }
}
