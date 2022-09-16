package com.srpingfranework.zy.transaction.transfer.mandatory;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestMandatoryController {

    @Autowired
    private UserService7 userService7;

    @GetMapping("mandatory")
    public String test() {
        userService7.update();
        return "ok";
    }
}
