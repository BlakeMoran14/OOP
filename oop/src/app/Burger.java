package app;

public class Burger extends Food {
    private final static int BUNS = 2;
    private int baconStrips;
    private int patties;
    private int tomatoes;
    private boolean ketchup;
    private boolean mayo;
    private String NAME;

    public Burger(int baconStrips, int patties, int tomatoes, boolean ketchup, boolean mayo, String name, int calories, boolean vegan) {
        this.baconStrips = baconStrips;
        this.patties = patties;
        this.tomatoes = tomatoes;
        this.ketchup = ketchup;
        this.mayo = mayo;
        this.NAME = name;
        this.calories = calories;
        this.vegan = vegan;
    }

    public static int getBuns() {
        return BUNS;
    }

    public int getBaconStrips() {
        return baconStrips;
    }

    public int getPatties() {
        return patties;
    }

    public int getTomatoes() {
        return tomatoes;
    }

    public boolean hasKetchup() {
        return ketchup;
    }

    public boolean hasMayo() {
        return mayo;
    }

    public String getName() {
        return NAME;
    }
}