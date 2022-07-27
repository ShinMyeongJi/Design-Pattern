public abstract class Beverage {
    String description;

    public String getDescription() {
        return this.description;
    }

    abstract double cost();
}
