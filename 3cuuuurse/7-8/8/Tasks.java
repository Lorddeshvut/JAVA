public class Tasks {
    private String nameTask;
    private boolean statusTask;
    public Tasks(String nameTask, boolean statusTask) {
        this.nameTask = nameTask;
        this.statusTask = statusTask;
    }
    public void setStatusTask(boolean statusTask) {
        this.statusTask = statusTask;
    }
    public Memento createMemento() {
        return new Memento(nameTask, statusTask);
    }
    public void restore(Memento memento) {
        nameTask = memento.getNameTask();
        statusTask = memento.getStatusTask();
    }
    @Override
    public String toString() {
        return "Task = "  + nameTask  +
                ", status = " + statusTask;
    }
}
