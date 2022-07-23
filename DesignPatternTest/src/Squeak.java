public class Squeak implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("살아있는 오리는 아니지만 소리는 나요");
    }
}
