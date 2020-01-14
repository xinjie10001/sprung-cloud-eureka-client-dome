package com.gupao.user.service;

import com.gupao.user.domain.User;

import java.util.Collection;

public interface UserService {

    /**
     * 保存用户
     * @param user
     * @return
     */
    boolean save(User user);

    /**
     * 查询所有的用户对象
     * @return
     */
    Collection<User> findAll();
}
