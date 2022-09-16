package com.srpingfranework.zy.transaction.transfer.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService2 {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional
    public void update() {
        jdbcTemplate.update("update user set money = ? where id = ?", 234, 2);
    }
}
