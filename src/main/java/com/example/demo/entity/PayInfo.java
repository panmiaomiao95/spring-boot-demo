package com.example.demo.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * Created by Admin on 2018/2/27.
 */
@Entity
@Table(name = "bp_pay_info")
public class PayInfo {
    private Integer id;
    private Date createTime;
    private Integer orderNo;
    private Integer payPlatFrom;
    private String platFromNumber;
    private String platFromStatus;
    private Date updateTime;
    private Integer userId;
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @Column(name = "create_time")
    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Column(name = "order_no")
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }
    @Column(name = "pay_platform")
    public Integer getPayPlatFrom() {
        return payPlatFrom;
    }

    public void setPayPlatFrom(Integer payPlatFrom) {
        this.payPlatFrom = payPlatFrom;
    }
    @Column(name = "platform_number")
    public String getPlatFromNumber() {
        return platFromNumber;
    }

    public void setPlatFromNumber(String platFromNumber) {
        this.platFromNumber = platFromNumber;
    }
    @Column(name = "platform_status")
    public String getPlatFromStatus() {
        return platFromStatus;
    }

    public void setPlatFromStatus(String platFromStatus) {
        this.platFromStatus = platFromStatus;
    }
    @Column(name = "update_time")
    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
    @Column(name = "user_id")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
