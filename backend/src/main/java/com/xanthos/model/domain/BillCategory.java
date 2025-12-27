package com.xanthos.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 账单分类表
 * @TableName bill_category
 */
@TableName(value ="bill_category")
@Data
public class BillCategory {
    /**
     * 分类主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long categoryId;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 分类名称（如餐饮、工资）
     */
    private String categoryName;

    /**
     * 类型（0-支出/1-收入）
     */
    private Integer type;

    /**
     * 分类图标URL
     */
    private String icon;

    /**
     * 排序权重（数字越小越前）
     */
    private Integer sort;

    /**
     * 是否系统默认分类（0-否/1-是）
     */
    private Integer isDefault;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    @TableLogic
    private Integer isDelete;
}