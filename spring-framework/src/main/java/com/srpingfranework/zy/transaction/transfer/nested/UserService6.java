package com.srpingfranework.zy.transaction.transfer.nested;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService6 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation= Propagation.NESTED)
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 1000, 2);
         int i = 1/0;
    }
}
