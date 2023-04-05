package com.dragondj.passcs.question.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.passcs.question.entity.QuestionEntity;

import java.util.Map;

/**
 * 
 *
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 00:23:00
 */
public interface QuestionService extends IService<QuestionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

