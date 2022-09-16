package com.srpingfranework.zy.transaction.transfer.required;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRequiredController {

    @Autowired
    private UserService1 userService1;

    @GetMapping("required")
    public String test() {
        userService1.update();
        return "ok";
    }
}
