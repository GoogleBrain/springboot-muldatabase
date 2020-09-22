package cn.k.springbootmuldatabase.controller;

import cn.k.springbootmuldatabase.domain.UserInfo;
import cn.k.springbootmuldatabase.sevice.AppService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class AppController {

    @Resource
    private AppService service;

    @GetMapping(path = "/get01")
    public List<UserInfo> get01() {
        //查询A01数据
        return service.getUser01();
    }

    @GetMapping(path = "/get02")
    public List<UserInfo> get02() {
        //查询A02数据
        return service.getUser02();
    }
}