package mqray.cn.observerMode;

import java.util.concurrent.Executor;

/**
 * @author ray
 * Date 8/3/21
 */
public class AsyncEventBus extends EventBus {

    public AsyncEventBus(Executor executor) {
        super(executor);
    }
}
