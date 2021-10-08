public class StartState implements State {

    public void doAction(Context context) {
        System.out.println("Balls are in good condition");
        context.setState(this);
    }

    public String toString(){
        return "Can be sold";
    }
}