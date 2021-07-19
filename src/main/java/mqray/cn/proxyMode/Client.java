package mqray.cn.proxyMode;

import java.lang.reflect.Proxy;

/**
 * Created by Intellij IDEA.
 * User: mqray
 * Date: 2021/7/19
 */
public class Client {

    public static void main(String[] args) {
        // 真实对象
        Subject realSubject = new RealSubject();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(realSubject);
        // 代理对象
        Subject proxyInstance= (Subject) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{Subject.class}, myInvocationHandler);
        proxyInstance.sellBooks();
        proxyInstance.speak();
    }
}
