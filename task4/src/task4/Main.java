package task4;

public class Main {
	public static void main(String[] args) {
		String login = "lord";
		String password = "12345lord";
		if (login.equals(args[0]) && password.equals(args[1])) {
			System.out.println("Вас узнали. Добро пожаловать");
			
		} else {
			System.out.println("Логин и пароль не распознаны. Доступ запрещён");
		}
			
	}
}
