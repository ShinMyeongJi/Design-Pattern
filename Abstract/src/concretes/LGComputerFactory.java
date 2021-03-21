package concretes;

import abstractFactory.ComputerFactory;
import products.Impl.LGKeyboard;
import products.Impl.LGMouse;
import products.Keyboard;
import products.Mouse;

public class LGComputerFactory implements ComputerFactory {
    @Override
    public Keyboard createKeyboard() {
        return new LGKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new LGMouse();
    }
}
