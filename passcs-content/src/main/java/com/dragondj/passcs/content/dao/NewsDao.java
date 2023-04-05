package com.dragondj.passcs.content.dao;

import com.dragondj.passcs.content.entity.NewsEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 内容-资讯表
 * 
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:52:49
 */
@Mapper
public interface NewsDao extends BaseMapper<NewsEntity> {
	
}
