package mqray.cn.TemplateMode;

/**
 * @author ray
 * Date 8/5/21
 */
public class TestDemo {

    public static void main(String[] args) {
        /**
         * 老师布置作业，布置完就去睡觉了
         * 学生去做，做完通知老师
         */
        Student lawence = new Lawence();
        // 在这里要确定是问的哪个学生，所以在初始化老师工作时，就确定了学生
        MathTeacher mathTeacher = new MathTeacher(lawence);
        // 老师要告诉学生，这个问题，所以要确定学生是谁
        mathTeacher.askQuestion();
    }
}
