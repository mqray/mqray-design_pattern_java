package mqray.cn.proxyMode;

/**
 * Created by Intellij IDEA.
 * User: mqray
 * Date: 2021/7/19
 */
public class RealSubject implements Subject {


    @Override
    public int sellBooks() {
        System.out.println("卖书");
        return 1;
    }

    @Override
    public String speak() {
        System.out.println("说话");
        return "crazy";
    }
}
