public class Headphones extends Shape{
    public Headphones(Function function){
        super(function);
    }
    @Override
    public void push(){
        System.out.println("Headphones: ");
        function.button();
    }
}
