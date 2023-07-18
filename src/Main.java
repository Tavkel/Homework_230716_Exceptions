public class Main {
    public static void main(String[] args) {
        String login = "sad";
        String password = "asdasd";
        String passwordConfirmation = "asdasdasd";

        try {
            AuthenticationValidator.validateAuthenticationData(login, password, passwordConfirmation);
            System.out.println("Hello world!");
        } catch (WrongLoginException e) {
            System.out.println("Неверные данные авторизации: логин не подходит");
        } catch (WrongPasswordException e) {
            System.out.println("Неверные данные авторизации: пароль не подходит");
        } finally {
            System.out.println("Проверка выполнена");
        }
    }
}