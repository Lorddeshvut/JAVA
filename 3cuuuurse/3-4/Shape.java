public abstract class Shape {
    protected Function function;
    public Shape(Function function){
        this.function = function;
    }
    abstract public void push();
}
