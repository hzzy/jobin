package com.srpingfranework.zy.transaction.transfer.requiresnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService3 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService4 userService4;

    /**
     * requires new
     *
     * 存在两个事务
     * 如果内部事务异常，外部catch住，则内部事务回滚，外部事务不回滚
     * 如果外部事务异常，内部事务不回滚，外部事务回滚
     *
     * 个人理解：两个事务互相独立，个回滚个的，互不影响（前提是外部调用catch住内部的异常）
     */
    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 123, 1);
        try {
            userService4.update();
        } catch (Exception e) {
        }

//        int i = 1 / 0;
    }
}
