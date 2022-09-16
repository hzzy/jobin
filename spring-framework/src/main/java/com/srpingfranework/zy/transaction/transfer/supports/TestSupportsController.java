package com.srpingfranework.zy.transaction.transfer.supports;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSupportsController {

    @Autowired
    private UserService9 userService9;

    @GetMapping("supports")
    public String test() {
        userService9.update();
        return "ok";
    }
}
