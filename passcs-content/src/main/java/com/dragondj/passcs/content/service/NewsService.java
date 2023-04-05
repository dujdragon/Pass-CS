package com.dragondj.passcs.content.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.passcs.content.entity.NewsEntity;

import java.util.Map;

/**
 * 内容-资讯表
 *
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:52:49
 */
public interface NewsService extends IService<NewsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

