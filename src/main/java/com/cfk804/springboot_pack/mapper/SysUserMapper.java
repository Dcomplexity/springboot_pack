package com.cfk804.springboot_pack.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.cfk804.springboot_pack.entity.SysUser;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author cfk804
* @description 针对表【sys_user】的数据库操作Mapper
* @createDate 2022-06-16 15:34:57
* @Entity generator.domain.SysUser
*/

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
    @Select("select * from sys_user")
    List<SysUser> findAll();

    @Insert("insert into sys_user(username, password, nickname, email, phone, address) " +
            "VALUES (#{username}, #{password}, #{nickname}, #{email}, #{phone}, #{address})")
    int insert();
}




