class User {
    private String name;
    public User(String name) {
        this.name = name;
    }

    public void print() {
        Printer printer = Printer.getInstance();
        printer.print(this.name + " user using a print");
    }
}

public class Main {
    public static final int SIZE = 5;
    public static void main(String[] args) {

        User[] users = new User[SIZE];

        for(int i = 0; i < users.length; i++) {
            users[i] = new User(i+1 +" 번째");
            users[i].print();
        }
    }

}
