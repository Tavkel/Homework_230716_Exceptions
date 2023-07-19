public class AuthenticationValidator {
    private final static String LOGIN_RULES = "^\\w{1,20}$";
    private final static String PASSWORD_RULES = "^\\w{1,20}$";
    public static void validateAuthenticationData(String login, String password, String passwordConfirmation) throws WrongLoginException, WrongPasswordException{
        validateLogin(login);
        validatePassword(password, passwordConfirmation);
    }

    private static void validateLogin(String login) throws WrongLoginException{
        if(!login.matches(LOGIN_RULES)){
            throw new WrongLoginException("Login does not meet requirements!");
        }
    }

    private static void validatePassword(String password, String passwordConfirmation) throws WrongPasswordException{
        if (!password.matches(PASSWORD_RULES)){
            throw new WrongPasswordException("Password does not meet requirements");
        }
        if (!password.equals(passwordConfirmation)){
            throw new WrongPasswordException("Password does not meet requirements");
        }
    }
}
