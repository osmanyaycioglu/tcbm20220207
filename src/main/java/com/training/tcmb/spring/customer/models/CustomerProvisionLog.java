package com.training.tcmb.spring.customer.models;

import javax.persistence.*;

@Entity
@TableGenerator(name = "CusLogTG", table = "gen_id", pkColumnName = "id_name", pkColumnValue = "custLog", valueColumnName = "id_value", allocationSize = 20, initialValue = 1)
public class CustomerProvisionLog {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE, generator = "CusLogTG")
    private Long logId;
    private String logStr;
    private String logLevel;

    @PrePersist
    @PreUpdate
    public void before() {
    }

    @PreRemove
    public void beforeDelete() {
    }

    @PostPersist
    @PostUpdate
    @PostRemove
    @PostLoad
    public void after() {
    }

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public String getLogStr() {
        return logStr;
    }

    public void setLogStr(String logStr) {
        this.logStr = logStr;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel;
    }
}
