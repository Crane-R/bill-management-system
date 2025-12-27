package com.xanthos.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xanthos.model.domain.SysUser;
import com.xanthos.service.SysUserService;
import com.xanthos.mapper.SysUserMapper;
import org.springframework.stereotype.Service;

/**
* @author Crane Resigned
* @description 针对表【sys_user(系统用户表)】的数据库操作Service实现
* @createDate 2025-12-27 14:32:51
*/
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
    implements SysUserService{

}




