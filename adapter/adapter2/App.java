package adapter2;

public class App {
    public static void main(String[] args) {
        OldCoffeeMachine oldMachine = new OldCoffeeMachine();
        CoffeeTouchscreenAdapter cafeTouch = new CoffeeTouchscreenAdapter(oldMachine);

        cafeTouch.chooseFirstSelection();
        cafeTouch.chooseSecondSelection();
    }
}
