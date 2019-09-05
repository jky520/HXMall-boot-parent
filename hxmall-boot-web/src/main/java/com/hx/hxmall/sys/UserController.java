package com.hx.hxmall.sys;

import com.hx.hxmall.entity.sys.User;
import com.hx.hxmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @GetMapping("/{id}")
    public User show(@PathVariable int id) {
        return userService.load(id);
    }
}
