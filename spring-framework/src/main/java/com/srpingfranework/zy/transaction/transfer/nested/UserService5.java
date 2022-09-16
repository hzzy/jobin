package com.srpingfranework.zy.transaction.transfer.nested;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService5 {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    @Autowired
    private UserService6 userService6;

    /**
     * nested
     *
     * 如果当前存在事务，则创建一个事务作为当前事务的嵌套事务来运行，如果不存在事务，则该取值等价于required
     * <p>
     * 如果外部事务异常回滚，则内部事务一起回滚
     * 如果内部事务异常回滚，则外部事务不回滚
     *
     * 个人理解：外部事务是老大，内部事务是小弟，小弟异常 不影响老大，老大异常，小弟也得跟着回滚
     */
    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 1000, 1);
        try {
            userService6.update();
        } catch (Exception e) {
        }
//        int i = 1 / 0;
    }
}
