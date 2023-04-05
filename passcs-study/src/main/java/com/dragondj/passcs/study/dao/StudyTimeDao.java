package com.dragondj.passcs.study.dao;

import com.dragondj.passcs.study.entity.StudyTimeEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 学习-用户学习时常表
 * 
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:55:07
 */
@Mapper
public interface StudyTimeDao extends BaseMapper<StudyTimeEntity> {
	
}
