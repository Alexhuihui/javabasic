package top.alexmmd.javabasic.reflect;

import java.util.Date;

/**
 * @author 汪永晖
 * @Date 2021/1/7 10:58
 */
public class A {

    private String name;

    private Integer count;

    private Date birth;

    public A(String name, Integer count, Date birth) {
        this.name = name;
        this.count = count;
        this.birth = birth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    @Override
    public String toString() {
        return "A{" +
                "name='" + name + '\'' +
                ", count=" + count +
                ", birth=" + birth +
                '}';
    }
}
