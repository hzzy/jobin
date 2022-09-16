package com.srpingfranework.zy.transaction.transfer.mandatory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService7 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService8 userService8;

    /**
     * mandatory 强制
     * <p>
     * 如果当前存在事务，则加入事务
     * 如果当前不存在事务，则抛出异常
     * <p>
     * 个人理解：内部强制要求外部事务存在，否则抛异常
     */
//    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 1000, 1);
        userService8.update();
    }
}
