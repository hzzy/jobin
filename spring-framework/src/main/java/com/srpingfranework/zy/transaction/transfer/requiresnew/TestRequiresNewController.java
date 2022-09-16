package com.srpingfranework.zy.transaction.transfer.requiresnew;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRequiresNewController {

    @Autowired
    private UserService3 userService3;

    @GetMapping("requires-new")
    public String test() {
        userService3.update();
        return "ok";
    }
}
