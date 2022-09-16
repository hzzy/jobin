package com.srpingfranework.zy.transaction.transfer.notsupported;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestNotSupportedController {

    @Autowired
    private UserService11 userService11;

    @GetMapping("not-supported")
    public String test() {
        userService11.update();
        return "ok";
    }
}
