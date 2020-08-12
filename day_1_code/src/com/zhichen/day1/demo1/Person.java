package com.zhichen.day1.demo1;

import java.util.Objects;

/**
 * @author Zhichen
 * @school FZU
 * @create 2020-08-08 11:22
 */
public class Person {
    private String name;
    private int num;

    //觉得打印对象的地址值没有意义，因此要重写Object类的toString方法


//    @Override
//    public String toString() {
//        return "Person{name="+name+", age="+num+"}";
//    }

//    @Override
//    public boolean equals(Object obj) {
//        Person p = (Person) obj;
//        return this.name.equals(p.name) && this.num == p.num;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return num == person.num &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, num);
    }

    public Person(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
