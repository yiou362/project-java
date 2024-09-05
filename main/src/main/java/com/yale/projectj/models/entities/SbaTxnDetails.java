package com.yale.projectj.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "SBA_TXN_DETAILS", schema = "TPDBA")
public class SbaTxnDetails {

    @Id
    @Column(name = "REF_NUM")
    private String refNum;

    @Column(name = "BWR_NAME_1", nullable = false)
    private String bwrName1;

    @Column(name = "BWR_NAME_2")
    private String bwrName2;

    @Column(name = "BWR_NAME_3")
    private String bwrName3;

    @Column(name = "BWR_IND", nullable = false)
    private String bwrInd;

    @Column(name = "BWR_ID_TYPE", nullable = false)
    private String bwrIdType;

    @Column(name = "BWR_ID_VALUE")
    private String bwrIdValue;

    @Column(name = "BWR_INCORP_DATE_Y")
    private String bwrIncorpDateY;

    @Column(name = "BWR_INCORP_DATE_M")
    private String bwrIncorpDateM;

    @Column(name = "BWR_INCORP_DATE_D")
    private String bwrIncorpDateD;

    @Column(name = "BWR_INCORP_PLACE")
    private String bwrIncorpPlace;

    @Column(name = "BWR_ADDRESS_1", nullable = false)
    private String bwrAddress1;

    @Column(name = "BWR_ADDRESS_2")
    private String bwrAddress2;

    @Column(name = "BWR_ADDRESS_3")
    private String bwrAddress3;

    @Column(name = "BWR_ADDRESS_4")
    private String bwrAddress4;

    @Column(name = "BWR_AREA_CODE", nullable = false)
    private String bwrAreaCode;

    @Column(name = "SUBMIT_LN_ROLE")
    private String submitLnRole;

    @Column(name = "LDR_NAME_1", nullable = false)
    private String ldrName1;

    @Column(name = "LDR_NAME_2")
    private String ldrName2;

    @Column(name = "LDR_NAME_3")
    private String ldrName3;

    @Column(name = "LDR_IND", nullable = false)
    private String ldrInd;

    @Column(name = "LDR_ID_TYPE", nullable = false)
    private String ldrIdType;

    @Column(name = "LDR_ID_VALUE")
    private String ldrIdValue;

    @Column(name = "LDR_INCORP_DATE_Y")
    private String ldrIncorpDateY;

    @Column(name = "LDR_INCORP_DATE_M")
    private String ldrIncorpDateM;

    @Column(name = "LDR_INCORP_DATE_D")
    private String ldrIncorpDateD;

    @Column(name = "LDR_INCORP_PLACE")
    private String ldrIncorpPlace;

    @Column(name = "LDR_ADDRESS_1", nullable = false)
    private String ldrAddress1;

    @Column(name = "LDR_ADDRESS_2")
    private String ldrAddress2;

    @Column(name = "LDR_ADDRESS_3")
    private String ldrAddress3;

    @Column(name = "LDR_ADDRESS_4")
    private String ldrAddress4;

    @Column(name = "LDR_AREA_CODE", nullable = false)
    private String ldrAreaCode;

    @Column(name = "EXE_DATE_Y", nullable = false)
    private String exeDateY;

    @Column(name = "EXE_DATE_M", nullable = false)
    private String exeDateM;

    @Column(name = "EXE_DATE_D", nullable = false)
    private String exeDateD;

    @Column(name = "EXPIRY_DATE_Y")
    private String expiryDateY;

    @Column(name = "EXPIRY_DATE_M")
    private String expiryDateM;

    @Column(name = "EXPIRY_DATE_D")
    private String expiryDateD;

    @Column(name = "EFFECT_DATE_Y")
    private String effectDateY;

    @Column(name = "EFFECT_DATE_M")
    private String effectDateM;

    @Column(name = "EFFECT_DATE_D")
    private String effectDateD;

    @Column(name = "AGREE_TYPE")
    private String agreeType;

    @Column(name = "APPROVED_VERSION")
    private String approvedVersion;

    @Column(name = "APPROVED_VERSION_SUB")
    private String approvedVersionSub;

    @Column(name = "OTHER_CLAUSE_A")
    private String otherClauseA;


    @Column(name = "OTHER_CLAUSE_B")
    private String otherClauseB;

    @Column(name = "OTHER_CLAUSE_C")
    private String otherClauseC;

    @Column(name = "SUPP_DOC_IND")
    private String suppDocInd;

    @Column(name = "REG_APP_CAPACITY")
    private String regAppCapacity;

    @Column(name = "LN_APP_CAPACITY")
    private String lnAppCapacity;

    @Column(name = "CONTACT_PERSON_1", nullable = false, length = 134)
    private String contactPerson1;

    @Column(name = "CONTACT_PERSON_2", length = 134)
    private String contactPerson2;

    @Column(name = "CONTACT_PERSON_3", length = 64)
    private String contactPerson3;

    @Column(name = "CONTACT_REF_NUM", length = 54)
    private String contactRefNum;

    @Column(name = "EMAIL", length = 50)
    private String email;

    @Column(name = "COUNTRY_CODE", length = 10)
    private String countryCode;

    @Column(name = "TEL_NUM", length = 20)
    private String telNum;

    @Column(name = "PAY_METHOD", length = 1)
    private String payMethod;

    @Column(name = "PAY_AMOUNT")
    private String payAmount;

    @Column(name = "USER_LANG", nullable = false, length = 1)
    private String userLang;

    @Column(name = "LAST_UPD_DATE", nullable = false)
    private Date lastUpdDate;

    @Column(name = "LAST_UPD_BY", nullable = false, length = 16)
    private String lastUpdBy;

    @Column(name = "PAY_TYPE", length = 30)
    private String payType;

    @Column(name = "SUBMISSION_TIME", length = 30)
    private String submissionTime;

}
