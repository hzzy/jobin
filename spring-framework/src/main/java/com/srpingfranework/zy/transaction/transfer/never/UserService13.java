package com.srpingfranework.zy.transaction.transfer.never;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService13 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService14 userService14;

    /**
     * never
     * <p>
     * 以非事务方式运行
     * 如果当前存在事务，则抛出异常
     * <p>
     * 个人理解：不跟大哥混，存在外部事务就抛异常
     */
//    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 1000, 1);
        userService14.update();
    }
}
