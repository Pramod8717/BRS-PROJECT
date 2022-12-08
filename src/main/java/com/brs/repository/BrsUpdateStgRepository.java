package com.brs.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.brs.entities.BrsConsotUpdateStg;

@Repository
public interface BrsUpdateStgRepository extends JpaRepository<BrsConsotUpdateStg, Long> {
	
//	@Query(value = "select * from UAT_XXCD_BRS_CONS_UPDATE_STG_1 where cheq_id = ?", nativeQuery = true)
	@Query(value = "select * from UAT_XXCD_BRS_CONS_UPDATE_STG where cheq_id = ?", nativeQuery = true)
	BrsConsotUpdateStg getBrsUpdateStgData(long chequeId);
}
