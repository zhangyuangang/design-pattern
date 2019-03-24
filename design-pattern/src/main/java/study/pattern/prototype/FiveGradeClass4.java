package study.pattern.prototype;

import lombok.Data;

import java.io.*;
import java.util.List;

/**
 * 五年级4班
 * 这里用来模拟一个复杂的对象
 */
@Data
public class FiveGradeClass4 implements Cloneable, Serializable {

    private List<Student> students;
    private String classAddress;

    public FiveGradeClass4(List<Student> students, String classAddress) {
        this.students = students;
        this.classAddress = classAddress;
    }

    public FiveGradeClass4 deepClone() throws Exception {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);

        return (FiveGradeClass4) ois.readObject();
    }
}
