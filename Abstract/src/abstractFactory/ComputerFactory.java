package abstractFactory;

import products.Keyboard;
import products.Mouse;

public interface ComputerFactory {
    Keyboard createKeyboard();
    Mouse createMouse();
}
