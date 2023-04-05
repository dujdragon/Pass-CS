package com.dragondj.passcs.channel.dao;

import com.dragondj.passcs.channel.entity.AccessTokenEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 渠道-认证表
 * 
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:51:57
 */
@Mapper
public interface AccessTokenDao extends BaseMapper<AccessTokenEntity> {
	
}
