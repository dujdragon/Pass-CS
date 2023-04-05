package com.dragondj.passcs.channel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.passcs.channel.entity.AccessTokenEntity;

import java.util.Map;

/**
 * 渠道-认证表
 *
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:51:57
 */
public interface AccessTokenService extends IService<AccessTokenEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

