package com.example.demo.model;

/**
 * @Description
 * @Author lixd
 * @Date 2020/8/18
 */
public class People {

    private Integer name;

    public People(Integer name) {
        this.name = name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getName() {
        return name;
    }

    @Override
    public String toString() {
        return "People{" +
                "name=" + name +
                '}';
    }
}
