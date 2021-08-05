package mqray.cn.TemplateMode;

/**
 * @author ray
 * Date 8/5/21
 */
public class MathTeacher implements Teacher{

    private Student student;

    public MathTeacher(Student student){
        this.student = student;
    }

    @Override
    public void askQuestion() {
        System.out.println("算一下18+19等于几？");
        // 学生去做某件事
        student.resolveQuestion(this, 18, 19);
        // 学生做完之后应该通知老师(也即回调)
    }

    @Override
    public void tellAnswer(int answer) {
        System.out.println("老师，我做出来了，结果是18+19:= " + answer);
    }
}
