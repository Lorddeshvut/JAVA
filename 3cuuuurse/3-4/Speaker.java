public class Speaker extends Shape{
    public Speaker(Function function){
        super(function);
    }
    @Override
    public void push(){
        System.out.println("Speaker: ");
        function.button();
    }
}

