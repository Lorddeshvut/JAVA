public class Player extends Shape{
    public Player(Function function){
        super(function);
    }
    @Override
    public void push(){
        System.out.println("Player: ");
        function.button();
    }
}
