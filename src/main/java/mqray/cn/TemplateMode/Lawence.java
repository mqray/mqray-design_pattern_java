package mqray.cn.TemplateMode;

/**
 * @author ray
 * Date 8/5/21
 */
public class Lawence implements Student{
    @Override
    public void resolveQuestion(Teacher teacher, int x, int y) {
        int answer = 0;

        try{
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
        answer = x + y;
        // 得到答案之后应该告诉老师，通知老师
        teacher.tellAnswer(answer);
    }
}
