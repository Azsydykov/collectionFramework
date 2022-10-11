package kg.megacom.models;

public class HeavyBox {
    private String name;
    private double weight;


    public HeavyBox(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "HeavyBox{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
