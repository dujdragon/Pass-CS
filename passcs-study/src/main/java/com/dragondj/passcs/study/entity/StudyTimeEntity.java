package com.dragondj.passcs.study.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 学习-用户学习时常表
 * 
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 15:55:07
 */
@Data
@TableName("sms_study_time")
public class StudyTimeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	@TableId
	private Long id;
	/**
	 * 题目类型id
	 */
	private Long quesType;
	/**
	 * 用户id
	 */
	private Long memberId;
	/**
	 * 学习时常（分）
	 */
	private Integer totalTime;
	/**
	 * 删除标记（0-正常，1-删除）
	 */
	private Integer delFlag;
	/**
	 * 创建时间
	 */
	private Date createTime;
	/**
	 * 更新时间
	 */
	private Date updateTime;

}
