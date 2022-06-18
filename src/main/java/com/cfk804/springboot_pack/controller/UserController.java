package com.cfk804.springboot_pack.controller;

import com.cfk804.springboot_pack.entity.SysUser;
import com.cfk804.springboot_pack.mapper.SysUserMapper;
import com.cfk804.springboot_pack.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private SysUserMapper userMapper;

    @Autowired
    private SysUserService userService;

    // 新增和修改
    @PostMapping
    public Integer save(@RequestBody SysUser user) {
        // 新增或更新
        return userService.save(user);
    }

//    @GetMapping("/")
    // 查询所有数据
    @GetMapping
    public List<SysUser> findAll() {
        List<SysUser> all = userMapper.findAll();
        return all;
    }

    //分页查询
    // @RequestParam 接收 ？pageNum=1&pageSize=10, 这些是 url 里的参数
    @GetMapping("/page") // 接口路径: /user/page？pageNum=1&pageSize=10
    public List<SysUser> findPage(@RequestParam Integer pageNum, @RequestParam Integer pageSize) {
        List<SysUser> all = userMapper.findAll();
        return all;
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable Integer id) {
        return userMapper.deleteById(id);
    }
}
