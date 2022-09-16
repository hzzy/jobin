package com.srpingfranework.zy.transaction.transfer.never;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService14 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.NEVER)
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 1000, 2);
    }
}
