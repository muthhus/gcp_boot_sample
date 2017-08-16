package uk.jlr.digital.afrl.retailer.service.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import uk.jlr.digital.afrl.retailer.domain.Retailer;
import uk.jlr.digital.afrl.retailer.repository.RetailerRepository;
import uk.jlr.digital.afrl.retailer.service.RetailerService;

@Service
public class RetailerServiceImpl implements RetailerService{
	
	@Autowired
	private RetailerRepository retailerRepository;
	
   /**
    *
    * @return @throws Exception
    */
   @Override
   public Collection<Retailer> findAll() throws Exception {
       return retailerRepository.findAll(new Sort(Sort.Direction.ASC,"name"));
   }

}
