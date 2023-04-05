package com.dragondj.passcs.member.feign;

import com.dragondj.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 定义Feign组件的接口
 */
@FeignClient("passcs-study")    // 表示向哪个服务发起请求，value为服务名（spring.application.name定义），从注册中心nacos中查找
public interface StudyTimeFeignService {
    // @RequestMapping 设置向服务passcs-study发起请求的路径
    @RequestMapping("study/studytime/list/test")
    R getMemberStudyTimeTest();
}
