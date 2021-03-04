public class SuperRobotFactory extends RobotFactory{
    @Override
    public Robot createRobot(String name) {
        switch (name) {
            case "power" : return new PowerRobot();
            case "super" : return new SuperRobot();
        }
        return null;
    }
}
