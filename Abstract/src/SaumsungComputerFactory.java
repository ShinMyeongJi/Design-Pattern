import products.Keyboard;
import products.Mouse;

public class SaumsungComputerFactory implements ComputerFactory{

    @Override
    public Keyboard createKeyboard() {
        return new Keyboard.SaumsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new Keyboard.SaumsungMouse();
    }
}
