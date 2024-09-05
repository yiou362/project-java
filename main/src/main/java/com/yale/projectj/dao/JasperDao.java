package com.yale.projectj.dao;

import com.yale.projectj.SbaAcknowledgementDTO;
import com.yale.projectj.models.entities.SbaTxnDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Yale
 */
@Repository
public interface JasperDao extends JpaRepository<SbaTxnDetails, String> {

    @Query(
            value =
                    "select new com.yale.projectj.SbaAcknowledgementDTO(d.payType, d.payMethod, d.payAmount, "
                            + "d.refNum, "
                            + "d.exeDateD, d.exeDateM, d.exeDateY, "
                            + "d.bwrName1, d.bwrName2, d.bwrName3, "
                            + "d.ldrName1, d.ldrName2, d.ldrName3, "
                            + "d.userLang, d.submissionTime, d.submitLnRole, "
                            + "t.sbaNum, t.lnRefNum, t.tranType, t.lastUpdDate)  "
                            + "from SbaTxn t, SbaTxnDetails d "
                            + "where d.refNum = t.refNum "
                            + "and t.lastUpdDate between to_date(:beginDate, 'yyyymmddhh24miss') and to_date(:endDate, 'yyyymmddhh24miss') "
                            + "and t.status = 'A' "
                            + "and t.tranType <> 'P' "
                            + "order by d.refNum, t.lastUpdDate")
    List<SbaAcknowledgementDTO> querySbaAcknowledgementDTO(
            @Param("beginDate") String beginDate, @Param("endDate") String endDate);
}
