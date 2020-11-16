package app;

public class Chicken extends Food{
    private String type;
    private int temp;

    public Chicken(String type, int temp) {
        this.type = type;
        this.temp = temp;
    }

    public String getType() {
        return type;
    }

    public int getTemp() {
        return temp;
    }

    public void isFinished(int targetTemp) {
        if(temp == targetTemp) {
            System.out.println("Done!");
        } else {
            System.out.println("Not Done!");
        }
    }
}