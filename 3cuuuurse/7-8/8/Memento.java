public class Memento {
    private final String nameTask;
    private final boolean statusTask;
    public Memento(String nameTask, boolean statusTask) {
        this.nameTask = nameTask;
        this.statusTask = statusTask;
    }
    public String getNameTask() {
        return nameTask;
    }
    public boolean getStatusTask() {
        return statusTask;
    }
}
