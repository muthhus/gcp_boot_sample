package uk.jlr.digital.afrl.retailer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import uk.jlr.digital.afrl.retailer.domain.Retailer;



public interface RetailerRepository extends JpaRepository<Retailer, String>, JpaSpecificationExecutor<Retailer> {
	
}
