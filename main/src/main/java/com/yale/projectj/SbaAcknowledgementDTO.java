package com.yale.projectj;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class SbaAcknowledgementDTO {

    @Id
    @Column(name = "ref_num")
    private String ref_num;

    @Column(name = "last_upd_date")
    private Date last_upd_date;

    @Column(name = "submission_time")
    private String submission_time;

    @Column(name = "sba_num")
    private String sba_num;

    @Column(name = "ln_ref_num")
    private String ln_ref_num;

    @Column(name = "exe_date_y")
    private String exe_date_y;

    @Column(name = "exe_date_m")
    private String exe_date_m;

    @Column(name = "exe_date_d")
    private String exe_date_d;

    @Column(name = "bwr_name_1")
    private String bwr_name_1;

    @Column(name = "bwr_name_2")
    private String bwr_name_2;

    @Column(name = "bwr_name_3")
    private String bwr_name_3;

    @Column(name = "ldr_name_1")
    private String ldr_name_1;

    @Column(name = "ldr_name_2")
    private String ldr_name_2;

    @Column(name = "ldr_name_3")
    private String ldr_name_3;

    @Column(name = "pay_method")
    private String pay_method;

    @Column(name = "pay_amount")
    private String pay_amount;

    @Column(name = "pay_type")
    private String pay_type;

    @Column(name = "tran_type")
    private String tran_type;

    @Column(name = "user_lang")
    private String user_lang;

    @Column(name = "submit_ln_role")
    private String submit_ln_role;

    public SbaAcknowledgementDTO() {

    }
    public SbaAcknowledgementDTO(String payType, String payMethod, String payAmount,
                                 String refNum, String exeDateD, String exeDateM, String exeDateY,
                                 String bwrName1, String bwrName2, String bwrName3,
                                 String ldrName1, String ldrName2, String ldrName3,
                                 String userLang, String submissionTime, String submitLnRole,
                                 String sbaNum, String lnRefNum, String tranType, Date lastUpdDate) {


        this.pay_type = payType;
        this.pay_method = payMethod;
        this.pay_amount = payAmount;
        this.ref_num = refNum;
        this.exe_date_d = exeDateD;
        this.exe_date_m = exeDateM;
        this.exe_date_y = exeDateY;
        this.bwr_name_1 = bwrName1;
        this.bwr_name_2 = bwrName2;
        this.bwr_name_3 = bwrName3;
        this.ldr_name_1 = ldrName1;
        this.ldr_name_2 = ldrName2;
        this.ldr_name_3 = ldrName3;
        this.user_lang = userLang;
        this.submission_time = submissionTime;
        this.submit_ln_role = submitLnRole;
        this.sba_num = sbaNum;
        this.ln_ref_num = lnRefNum;
        this.tran_type = tranType;
        this.last_upd_date = lastUpdDate;
    }


}
