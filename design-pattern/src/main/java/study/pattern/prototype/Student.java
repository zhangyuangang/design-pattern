package study.pattern.prototype;

import lombok.Data;

import java.io.Serializable;

/**
 * 学生类
 */
@Data
public class Student implements Serializable {

    private String name;
    private int age;
    private String sex;
    private boolean atClassroom;

    public Student() {}

    public Student(String name, int age, String sex, boolean atClassroom) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.atClassroom = atClassroom;
    }

}
