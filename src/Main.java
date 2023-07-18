public class Main {
    public static void main(String[] args) {
        String login = "sad";
        String password = "qwertyergregrreggerergergeregr";
        String passwordConfirmation = "qwertyergregrreggerergergeregr";

        try {
            AuthenticationValidator.validateAuthenticationData(login, password, passwordConfirmation);
        } catch (WrongLoginException e) {
            System.out.println("Неверные данные авторизации: логин не подходит");
        } catch (WrongPasswordException e) {
            System.out.println("Неверные данные авторизации: пароль не подходит");
        } finally {
            System.out.println("Проверка выполнена");
        }

        System.out.println("Hello world!");
    }
}