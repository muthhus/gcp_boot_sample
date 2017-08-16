package uk.jlr.digital.afrl.retailer.service;

import java.util.Collection;

import uk.jlr.digital.afrl.retailer.domain.Retailer;

public interface RetailerService {
	/**
     * Returns all retailers
     *
     * @return
     * @throws Exception
     */
    public Collection<Retailer> findAll() throws Exception;
}
