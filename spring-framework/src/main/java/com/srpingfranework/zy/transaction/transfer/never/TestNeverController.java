package com.srpingfranework.zy.transaction.transfer.never;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestNeverController {

    @Autowired
    private UserService13 userService13;

    @GetMapping("never")
    public String test() {
        userService13.update();
        return "ok";
    }
}
