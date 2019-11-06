package com.freedom.foundationDb.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: HZB
 * @Description: 资产表
 * @Date: Created in 17:02 2019/10/31
 */
@Table(name = "t_means")
@Data
public class TMeans {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 基金代码
     */
    @Column(name = "found_code")
    private String foundCode;

    /**
     * 基金名称
     */
    @Column(name = "found_name")
    private String foundName;

    /**
     * 项目代码
     */
    @Column(name = "progress_code")
    private String progressCode;

    /**
     * 项目名称
     */
    @Column(name = "progress_name")
    private String progressName;

    /**
     * 成本
     */
    private BigDecimal cost;

    /**
     * 成本占比
     */
    @Column(name = "etc_percentage")
    private BigDecimal etcPercentage;

    /**
     * 累计份额
     */
    @Column(name = "add_up_share")
    private BigDecimal addUpShare;

    /**
     * 持有单价（加权购入净值）
     */
    @Column(name = "avg_net_value")
    private BigDecimal avgNetValue;

    /**
     * 市值（持有单价*累计份额）
     */
    private BigDecimal etc;

    /**
     * 持仓收益
     */
    @Column(name = "etc_income")
    private BigDecimal etcIncome;

    /**
     * 持仓收益率
     */
    @Column(name = "etc_income_percentage")
    private BigDecimal etcIncomePercentage;

    /**
     * 统计时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

    /**
     * 备注
     */
    private String remark;

}
