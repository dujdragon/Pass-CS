package com.dragondj.passcs.member.controller;

import java.util.Arrays;
import java.util.Map;

import com.dragondj.passcs.member.feign.StudyTimeFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dragondj.passcs.member.entity.MemberEntity;
import com.dragondj.passcs.member.service.MemberService;
import com.dragondj.common.utils.PageUtils;
import com.dragondj.common.utils.R;



/**
 * 会员-会员表
 *
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:54:27
 */
@RefreshScope // 开启自动刷新，从配置中心中获得配置
@RestController
@RequestMapping("member/member")
public class MemberController {
    @Autowired
    private MemberService memberService;
    @Autowired
    private StudyTimeFeignService studyTimeFeignService;

    /**
     * 测试使用Feign组件进行远程调用服务passcs-study
     * @return
     */
    @RequestMapping("/studytime/list/test")
    public R getStudyTimeByFeignTest() {
        return studyTimeFeignService.getMemberStudyTimeTest();
    }

    // 测试一下调用application.properties中定义的值
    @Value("${member.nickname}")
    private String name;
    @Value("${member.age}")
    private String age;
    @RequestMapping("/prop")
    public R testProperties() {
        return R.ok().put("name", name).put("age", age);
    }

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		MemberEntity member = memberService.getById(id);

        return R.ok().put("member", member);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody MemberEntity member){
		memberService.save(member);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody MemberEntity member){
		memberService.updateById(member);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		memberService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
