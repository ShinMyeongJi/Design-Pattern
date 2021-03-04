import com.shin.creator.HPCreator;
import com.shin.creator.ItemCreator;
import com.shin.creator.MPCreator;

public class Main {
    public static void main(String[] args) {
        RobotFactory rf = new SuperRobotFactory();
        System.out.println(rf.createRobot("super").getName());

        ItemCreator creator = new HPCreator();
        creator.create().use();

        System.out.println("==================================");

        ItemCreator creator1 = new MPCreator();
        creator1.create().use();


    }
}
