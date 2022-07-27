public class Main {
    public static void main(String[] args) {
        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);

        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());
    }
}
