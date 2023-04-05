package com.dragondj.passcs.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.passcs.question.entity.TypeEntity;

import java.util.Map;

/**
 * 题目-题目类型表
 *
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 00:23:00
 */
public interface TypeService extends IService<TypeEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

