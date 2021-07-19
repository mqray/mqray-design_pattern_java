package mqray.cn.proxyMode;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Intellij IDEA.
 * User: mqray
 * Date: 2021/7/19
 */
public class MyInvocationHandler implements InvocationHandler {

    Subject realSubject;

    public MyInvocationHandler(Subject realSubject) {
        this.realSubject = realSubject;
    }

    /**
     *
     * @param proxy  代理类
     * @param method 将要调用的方法
     * @param args 方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在调用代理类");
        if(method.getName().equals("sellBooks")){
            int invoke = (int) method.invoke(realSubject, args);
            System.out.println("调用的是卖书方法");
            return invoke;
        }else{
            String string = (String) method.invoke(realSubject, args);
            System.out.println("调用说话方法");
            return string;
        }
    }
}
