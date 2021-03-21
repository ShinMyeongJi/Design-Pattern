import products.Keyboard;
import products.Mouse;

public interface ComputerFactory {
    public Keyboard createKeyboard();
    public Mouse createMouse();
}
