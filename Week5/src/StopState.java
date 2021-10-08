public class StopState implements State {

    public void doAction(Context context) {
        System.out.println("Balls are in bad condition");
        context.setState(this);
    }

    public String toString(){
        return "Can't be sold";
    }
}