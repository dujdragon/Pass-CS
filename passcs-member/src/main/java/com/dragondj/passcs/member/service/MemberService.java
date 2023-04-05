package com.dragondj.passcs.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.passcs.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员-会员表
 *
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:54:27
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

