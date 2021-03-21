package products;

public interface Keyboard {
    class LGMouse implements Mouse {
        public LGMouse() {
            System.out.println("It's LG Mouse");
        }
    }

    class LGKeyboard implements Keyboard {
        public LGKeyboard() {
            System.out.println("It's LG Keyboard");
        }
    }

    class SaumsungKeyboard implements Keyboard {
        public SaumsungKeyboard() {
            System.out.println("It's Samsung Keyboard");
        }
    }

    class SaumsungMouse implements Mouse {
        public SaumsungMouse() {
            System.out.println("It's Samsung Mouse");
        }
    }
}
