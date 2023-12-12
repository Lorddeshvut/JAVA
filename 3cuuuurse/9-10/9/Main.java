/*Реализуйте "Систему учета пользователей" для хранения и
        управления данными пользователей, такими как их профили и сессии.*/
public class Main {
    public static void main(String[] args) {
        UserSystem userSystem = UserSystem.getInstance();
        UserData user1 = new UserData("cucumber", "989hwshs", "Ivan", 20, 3);
        UserData user2 = new UserData("tomato", "hshs989", "Petr", 25, 5);
        UserData user3 = new UserData("potato", "hshs989", "Vasya", 30, 7);
        userSystem.add(user1);
        userSystem.add(user2);
        userSystem.add(user3);
        userSystem.delete(user2);
        userSystem.show();
    }
}