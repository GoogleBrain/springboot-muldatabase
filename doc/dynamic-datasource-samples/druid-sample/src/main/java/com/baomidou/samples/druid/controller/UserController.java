package com.baomidou.samples.druid.controller;

import com.baomidou.samples.druid.entity.User;
import com.baomidou.samples.druid.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private static final Random RANDOM = new Random();
    private final UserService userService;

    @GetMapping("master")
    public List<User> masterUsers() {
        return userService.selectMasterUsers();
    }

    @GetMapping("slave")
    public List<User> slaveUsers() {
        return userService.selectSlaveUsers();
    }

    @PostMapping
    public User addUser() {
        User user = new User();
        user.setName("测试用户" + RANDOM.nextInt());
        user.setAge(RANDOM.nextInt(100));
        userService.addUser(user);
        return user;
    }

    @DeleteMapping("{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUserById(id);
        return "成功删除用户" + id;
    }
}
