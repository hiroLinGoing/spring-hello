package com.hiro.start.entity;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 12:20
 */
public class User{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User() {
        System.out.println("User constructor ...... ");
    }

    public User(String name) {

        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
