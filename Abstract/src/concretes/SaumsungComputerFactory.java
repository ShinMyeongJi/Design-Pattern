package concretes;

import abstractFactory.ComputerFactory;
import products.Impl.SamsungKeyboard;
import products.Impl.SamsungMouse;
import products.Keyboard;
import products.Mouse;

public class SaumsungComputerFactory implements ComputerFactory {

    @Override
    public Keyboard createKeyboard() {
        return new SamsungKeyboard();
    }

    @Override
    public Mouse createMouse() {
        return new SamsungMouse();
    }
}
