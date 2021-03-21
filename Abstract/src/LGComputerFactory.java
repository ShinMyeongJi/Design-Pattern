import products.Keyboard;
import products.Mouse;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new Keyboard.LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new Keyboard.LGMouse();
    }
}
