package mqray.cn.observerMode;

import java.util.List;
import java.util.concurrent.Executors;

/**
 * @author ray
 * Date 8/3/21
 */
public class UserController {

    // 依赖注入
    private UserService userService;

    private EventBus eventBus;
    private static final int DEFAULT_EVENTBUS_THREAD_POOL_SIZE = 1;

    public UserController() {
        //eventBus = new EventBus(); // 同步阻塞模式
        // 异步非阻塞模式
        eventBus = new AsyncEventBus(
                Executors.newFixedThreadPool(DEFAULT_EVENTBUS_THREAD_POOL_SIZE));
        userService = new UserService();
    }

    public void setRegObservers(List<Object> observers) {
        for (Object observer : observers) {
            eventBus.register(observer);
        }
    }

    public Long register(String telephone, String password) {
        //省略输入参数的校验代码
        //省略userService.register()异常的try-catch代码
        long userId = userService.register(telephone, password);

        eventBus.post(userId);
        System.out.println("userId: " + userId);

        return userId;
    }
}
