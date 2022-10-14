package lesson3.exercise2;

public abstract class Fruit {
    private int weight;
    private String name;

    public int getWeight() {
        return weight;
    }

    public Fruit(int weight, String name) {
        this.weight = weight;
        this.name = name;
    }

}
