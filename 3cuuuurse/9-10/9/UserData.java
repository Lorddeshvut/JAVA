public class UserData {
    private String login;
    private String password;
    private String name;
    private int age;
    private int hoursOfSession;
    public UserData(String login, String password, String name, int age, int hoursOfSession) {
        this.login = login;
        this.password = password;
        this.name = name;
        this.age = age;
        this.hoursOfSession = hoursOfSession;
    }
    public String getLogin() {
        return login;
    }
    public String getPassword() {
        return password;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public int getHoursOfSession() {
        return hoursOfSession;
    }
    public void setLogin(String login) {
        this.login = login;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
    public void setHoursOfSession(int hoursOfSession) {
        if (hoursOfSession > 0) {
            this.hoursOfSession = hoursOfSession;
        }
    }
}
