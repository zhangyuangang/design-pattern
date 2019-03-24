package study.pattern.prototype;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class FiveGradeClass4Test {

    @Test
    public void prototypeCloneTest() throws Exception {
        List<Student> students = new ArrayList<>();
        Student xiaoMing = new Student("小明", 17, "男", true);
        Student xiaoLi = new Student("小丽", 16, "女", false);
        Student xiaoZhang = new Student("小张", 16, "男", true);
        students.add(xiaoMing);
        students.add(xiaoLi);
        students.add(xiaoZhang);
        FiveGradeClass4 class4 = new FiveGradeClass4(students, "北京市朝阳区朝阳中学");

        System.out.println("原班级：" + class4);

        System.out.println("--------------------------");

        FiveGradeClass4 class4Clone = class4.deepClone();
        class4Clone.setClassAddress("成都市成华区成华中学");
        List<Student> studentsClone = class4Clone.getStudents();
        for (Student student : studentsClone) {
            if ("小明".equals(student.getName())) {
                student.setAge(18);
                student.setAtClassroom(false);
            }

            if ("小丽".equals(student.getName())) {
                student.setAge(18);
            }
        }
        System.out.println("克隆班级：" + class4Clone);

    }

}