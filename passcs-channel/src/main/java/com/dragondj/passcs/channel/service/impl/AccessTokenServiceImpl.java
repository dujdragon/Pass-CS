package com.dragondj.passcs.channel.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.common.utils.Query;

import com.dragondj.passcs.channel.dao.AccessTokenDao;
import com.dragondj.passcs.channel.entity.AccessTokenEntity;
import com.dragondj.passcs.channel.service.AccessTokenService;


@Service("accessTokenService")
public class AccessTokenServiceImpl extends ServiceImpl<AccessTokenDao, AccessTokenEntity> implements AccessTokenService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<AccessTokenEntity> page = this.page(
                new Query<AccessTokenEntity>().getPage(params),
                new QueryWrapper<AccessTokenEntity>()
        );

        return new PageUtils(page);
    }

}