package top.alexmmd.javabasic.reflect;

import java.util.Date;

/**
 * @author 汪永晖
 * @Date 2021/1/7 10:58
 */
public class B {

    private String count;

    private Date birth;

    private Integer name;

    public B() {
    }

    public B(String count, Date birth, Integer name) {
        this.count = count;
        this.birth = birth;
        this.name = name;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "B{" +
                "count='" + count + '\'' +
                ", birth=" + birth +
                ", name=" + name +
                '}';
    }
}
