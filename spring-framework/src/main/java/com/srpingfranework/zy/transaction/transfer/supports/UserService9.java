package com.srpingfranework.zy.transaction.transfer.supports;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService9 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService10 userService10;

    /**
     * supports
     * <p>
     * 如果当前存在事务，则加入事务
     * 如果当前不存在事务，则以非事务方式运行
     * <p>
     * 个人理解：有外部事务大哥就加入，没有就自己以非事务方式运行
     */
//    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 1000, 1);
        userService10.update();
//        int i = 1 / 0;
    }
}
