package app;

public class App {
    public static void main(String[] args) throws Exception {
        Burger burger = new Burger(1, 1, 1, true, false, "Main", 1000, false);
        burger.getCalories();
        burger.isVegan();

        Chicken chicken = new Chicken("finger", 100);
        chicken.isFinished(100);
    }

    public static void cool(){
        System.out.println("cool");
    }

    public static int addTwoNumbers(int x, int y) {
        return x + y;
    }

    public static int multiplyTwoNumbers(int x, int y) {
        return x * y;
    }

}