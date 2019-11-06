package com.freedom.foundationDb.dao.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: HZB
 * @Description: 基金表
 * @Date: Created in 17:02 2019/10/31
 */
@Table(name = "t_foundation")
@Data
public class TFoundation {

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
     * 最新净值
     */
    @Column(name = "new_net_value")
    private BigDecimal newNetValue;

    /**
     * 创建时间
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
