package com.dragondj.passcs.question.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 题目-题目类型表
 * 
 * @author dragondj
 * @email 1812296895@qq.com
 * @date 2023-04-02 00:23:00
 */
@Data
@TableName("qms_type")
public class TypeEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * 类型名称
	 */
	private String type;
	/**
	 * 备注
	 */
	private String comments;
	/**
	 * 类型logo路径
	 */
	private String logoUrl;
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
