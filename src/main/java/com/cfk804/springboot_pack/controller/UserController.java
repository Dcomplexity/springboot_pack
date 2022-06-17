package com.cfk804.springboot_pack.controller;

import com.cfk804.springboot_pack.entity.SysUser;
import com.cfk804.springboot_pack.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysUserMapper userMapper;

    @PostMapping
    public Integer save(@RequestBody SysUser user) {
        return userMapper.insert(user);
    }

//    @GetMapping("/")
    @GetMapping
    public List<SysUser> index() {
        List<SysUser> all = userMapper.findAll();
//        return userMapper.findAll();
        return all;
    }
}
