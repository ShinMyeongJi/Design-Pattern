public class Main {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        //mallardDuck.performFly();
        //mallardDuck.performQuack();
        mallardDuck.performFly();
        mallardDuck.setFlyBehavior(new FlyNoWay());

        mallardDuck.setQuackBehavior(new Quack()); // 실행 중 행동을 바꾼거임
        mallardDuck.performFly();
        mallardDuck.performQuack();
    }
}
