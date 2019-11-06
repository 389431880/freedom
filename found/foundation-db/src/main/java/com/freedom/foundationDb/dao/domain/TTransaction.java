package com.freedom.foundationDb.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: HZB
 * @Description: 交易表
 * @Date: Created in 17:08 2019/10/31
 */
@Table(name = "t_transaction")
@Data
public class TTransaction {

    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "SELECT LAST_INSERT_ID()")
    private Integer id;

    /**
     * 订单号
     */
    @Column(name = "order_no")
    private String order_no;

    /**
     * 基金代码
     */
    @Column(name = "found_code")
    private String found_code;

    /**
     * 交易类型 买buy卖sell
     */
    private String type;

    /**
     * 净值
     */
    @Column(name = "net_value")
    private BigDecimal netValue;

    /**
     * 份额
     */
    private BigDecimal share;

    /**
     * 总价
     */
    private BigDecimal account;

    /**
     * 手续费
     */
    @Column(name = "service_fee")
    private BigDecimal serviceFee;

    /**
     * 交易状态 0待确认1已确认
     */
    private Integer status;

    /**
     * 下单时间
     */
    @Column(name = "create_time")
    private LocalDateTime createTime;

    /**
     * 确认时间
     */
    @Column(name = "update_time")
    private LocalDateTime updateTime;

}
