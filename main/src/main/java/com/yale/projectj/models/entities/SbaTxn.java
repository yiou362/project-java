package com.yale.projectj.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "SBA_TXN")
@Data
public class SbaTxn {
    @Id
    @Column(name = "REF_NUM")
    private String refNum;

    @Column(name = "STS")
    private String status;

    @Column(name = "STS_UPD_TIME")
    private Date stsUpdTime;

    @Column(name = "AUTH_MEANS")
    private String authMeans;

    @Column(name = "AUTH_REF_NUM")
    private String authRefNum;

    @Column(name = "AUTH_ID_TYPE")
    private String authIdType;

    @Column(name = "AUTH_ID_VALUE")
    private String authIdValue;

    @Column(name = "TRAN_TYPE")
    private String tranType;

    @Column(name = "SBA_NUM")
    private String sbaNum;

    @Column(name = "LN_REF_NUM")
    private String lnRefNum;

    @Column(name = "LAST_UPD_DATE")
    private Date lastUpdDate;

    @Column(name = "LAST_UPD_BY")
    private String lastUpdBy;

    // Constructors, getters, and setters
}
