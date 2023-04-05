package com.dragondj.passcs.member.dao;

import com.dragondj.passcs.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员-会员表
 * 
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:54:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
