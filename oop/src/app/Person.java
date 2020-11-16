package app;

public class Person {

    private int age;
    private final String NAME;
    private int heightInches;
    private int numTimesSkydiving;
    private final static String SPECIES = "Human";

    public Person(int age, String name, int heightInches) {
        this(age, name, heightInches, 0);
    }

    public Person(int age, String name, int heightInches, int numTimesSkydiving) {
        this.age = age;
        this.NAME = name;
        this.heightInches = heightInches;
        this.numTimesSkydiving = numTimesSkydiving;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return NAME;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public int getNumTimesSkydiving() {
        return numTimesSkydiving;
    }

    public static String getSpecies() {
        return SPECIES;
    }

}