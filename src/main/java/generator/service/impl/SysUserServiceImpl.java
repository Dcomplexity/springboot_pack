package generator.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.SysUser;
import generator.service.SysUserService;
import generator.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author cfk804
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2022-06-16 15:34:57
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




