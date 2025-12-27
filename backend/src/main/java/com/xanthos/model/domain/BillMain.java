package com.xanthos.model.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableLogic;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 账单主表
 * @TableName bill_main
 */
@TableName(value ="bill_main")
@Data
public class BillMain {
    /**
     * 账单主键ID
     */
    @TableId(type = IdType.AUTO)
    private Long billId;

    /**
     * 所属用户ID
     */
    private Long userId;

    /**
     * 分类ID
     */
    private Long categoryId;

    /**
     * 金额（精确到分）
     */
    private BigDecimal amount;

    /**
     * 账单类型（0-日常/1-预算/2-报销）
     */
    private Integer billType;

    /**
     * 账单发生日期
     */
    private Date billDate;

    /**
     * 账单发生时间
     */
    private Date billTime;

    /**
     * 状态（0-未完成/1-已完成/2-作废）
     */
    private Integer status;

    /**
     * 备注（如“午餐-麦当劳”）
     */
    private String remark;

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