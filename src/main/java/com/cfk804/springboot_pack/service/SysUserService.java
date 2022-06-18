package com.cfk804.springboot_pack.service;

import com.cfk804.springboot_pack.entity.SysUser;
import com.cfk804.springboot_pack.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SysUserService {

    @Autowired
    private SysUserMapper userMapper;

    public int save(SysUser user) {
        if(user.getId() == null) { // user 没有 id，则表示新增
            return userMapper.insert(user);
        } else {  // 否则为更新
            return userMapper.update(user);
        }
    }
}
