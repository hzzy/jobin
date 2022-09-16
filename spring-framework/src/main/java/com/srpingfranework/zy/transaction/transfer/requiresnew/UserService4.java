package com.srpingfranework.zy.transaction.transfer.requiresnew;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService4 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRES_NEW)

    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 234, 2);
//        int i = 1 / 0;
    }
}
