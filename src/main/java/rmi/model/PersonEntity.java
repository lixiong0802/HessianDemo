package rmi.model;

/**
 * Created with IntelliJ IDEA.
 * User: LX
 * Date: 2015/12/25 14:08
 * Desc:
 */

import java.io.Serializable;

//注意对象必须继承Serializable
public class PersonEntity implements Serializable {
    private int id;
    private String name;
    private int age;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}