package com.yale.projectj.dao;

import com.yale.projectj.models.entities.GoodsStock;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Yale
 */
@Repository
public interface GoodsStockRepository extends JpaRepository<GoodsStock, Integer> {


}
