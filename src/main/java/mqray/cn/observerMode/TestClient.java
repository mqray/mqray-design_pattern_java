package mqray.cn.observerMode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ray
 * Date 8/3/21
 */
public class TestClient {

    public static void main(String[] args) {
        UserController controller = new UserController();
        List<Object> observers = new ArrayList<>();
        observers.add(new RegPromotionObserver());
        observers.add(new RegPromotionObserver());
        controller.setRegObservers(observers);
        controller.register("2123", "xxx");
        try {
            Thread.sleep(10000);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
