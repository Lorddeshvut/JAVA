import java.util.ArrayList;
import java.util.List;

public class UserSystem implements Monitoring{
    private static UserSystem instance;
    public static UserSystem getInstance() {
        if (instance == null) {
            instance = new UserSystem();
        }
        return instance;
    }
    List<UserData> users;
    private UserSystem() {
        users = new ArrayList<>();
    }

    @Override
    public void add(UserData user) {
        users.add(user);
    }

    @Override
    public void delete(UserData user) {
        users.remove(user);
    }

    @Override
    public void show() {
        for (UserData user : users) {
            System.out.println("Login: " + user.getLogin() + "; Password: "
                    + user.getPassword() + "; Name: " + user.getName() +
                    "; Age: " + user.getAge() + "; Hours of session: " + user.getHoursOfSession());
        }
    }
}
