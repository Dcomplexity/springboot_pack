package com.cfk804.springboot_pack.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 
 * @TableName dcf_1
 */
@TableName(value ="dcf_1")
@Data
public class Dcf1 implements Serializable {
    /**
     * 
     */
    private Double dq1I1;

    /**
     * 
     */
    private Double dq1I2;

    /**
     * 
     */
    private Double dq2I1;

    /**
     * 
     */
    private Double dq2I2;

    /**
     * 
     */
    private Double dq3I1;

    /**
     * 
     */
    private Double dq3I2;

    /**
     * 
     */
    private Double dq4I1;

    /**
     * 
     */
    private Double dq4I2;

    /**
     * 
     */
    private Double dq5I1;

    /**
     * 
     */
    private Double dq5I2;

    /**
     * 
     */
    private Double dq6I1;

    /**
     * 
     */
    private Double dq6I2;

    /**
     * 
     */
    private Double dq7I1;

    /**
     * 
     */
    private Double dq7I2;

    /**
     * 
     */
    private Double dq8I1;

    /**
     * 
     */
    private Double dq8I2;

    /**
     * 
     */
    private Double dq12I1;

    /**
     * 
     */
    private Double dq12I2;

    /**
     * 
     */
    private Double dq13I1;

    /**
     * 
     */
    private Double dq13I2;

    /**
     * 
     */
    private Double dyI1;

    /**
     * 
     */
    private Double dyI2;

    /**
     * 
     */
    private Double qzrI1;

    /**
     * 
     */
    private Double qzrI2;

    /**
     * 
     */
    private Double qbyI;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}