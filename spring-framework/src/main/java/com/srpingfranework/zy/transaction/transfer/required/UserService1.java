package com.srpingfranework.zy.transaction.transfer.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService1 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService2 userService2;

    /**
     * requried
     *
     * 自始至终只存在一个事务
     * <p>
     * 如果存在事务，咋加入
     * 不存在事务，则创建
     *
     * 个人理解：自始至终就一个事务，不论内部外部，有异常就回滚，无异常就提交
     */
    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 123, 1);
        userService2.update();
        int i = 1 / 0;
    }
}
