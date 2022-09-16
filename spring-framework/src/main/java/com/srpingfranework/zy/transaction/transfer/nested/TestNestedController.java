package com.srpingfranework.zy.transaction.transfer.nested;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestNestedController {

    @Autowired
    private UserService5 userService5;

    @GetMapping("nested")
    public String test() {
        userService5.update();
        return "ok";
    }
}
