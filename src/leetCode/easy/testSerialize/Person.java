package leetCode.easy.testSerialize;

import java.io.Serializable;

/**
 * @auther tianqi
 * @date 2019/6/29 11:08
 */
public class Person implements Serializable {
    private String name;
    private int age;
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
