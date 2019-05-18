package com.hiro.start.service;

import com.hiro.start.entity.User;

/**
 * Project: springStart
 *
 * @author : hirolin
 * @date : 2019/5/18 12:19
 */
public class UserInfoService {

    private String userFrom;

    private User user;

    public String getUserFrom() {
        return userFrom;
    }

    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void say() {
        System.out.println(userFrom);
        System.out.println(user.toString());
    }
}
