public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("전 소리를 내지 못해요");
    }
}
