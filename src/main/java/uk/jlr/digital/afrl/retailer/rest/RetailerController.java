package uk.jlr.digital.afrl.retailer.rest;

import java.util.Collection;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import uk.jlr.digital.afrl.common.contorller.BaseController;
import uk.jlr.digital.afrl.retailer.domain.Retailer;
import uk.jlr.digital.afrl.retailer.service.RetailerService;


@RestController
@RequestMapping("/api/v1/retailers")
public class RetailerController extends BaseController {
	
	 /**
     * Logger
     */
	private static Logger LOGGER = LoggerFactory.getLogger(RetailerController.class);
  
    /**
     * retailer service
     */
    protected RetailerService retailerService;

    /**
     *
     * @param retailerService
     */
    @Autowired
    public RetailerController(RetailerService retailerService) {
        this.retailerService = retailerService;
    }

//    @Autowired
//    DiscoveryClient client;
    
	
    /**
     * Fetch all retailers <code>http://.../retailer/</code>
     *
     * @return collection of retailers.
     */
//    @HystrixCommand(fallbackMethod = "defaultGetAllRetailers")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<Collection<Retailer>> findAll() {
    	LOGGER.info(String.format("retailer-service findByName() invoked:{}", retailerService.getClass().getName()));
        Collection<Retailer> retailers;
        try {
        	retailers = retailerService.findAll();
        } catch (Exception ex) {
        	LOGGER.debug("Exception raised findByName REST Call", ex);
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return retailers.size() > 0 ? new ResponseEntity<>(retailers, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
