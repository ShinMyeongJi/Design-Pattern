import abstractFactory.ComputerFactory;
import concretes.LGComputerFactory;
import concretes.SaumsungComputerFactory;

public class FactoryOfComputerFactory {
    public void createComputer(String type) {
        ComputerFactory computerFactory = null;

        switch (type) {
            case "samsung" :
                computerFactory = new SaumsungComputerFactory();
                break;
            case "lg" :
                computerFactory = new LGComputerFactory();
                break;
        }

        computerFactory.createKeyboard();
        computerFactory.createMouse();
    }
}
