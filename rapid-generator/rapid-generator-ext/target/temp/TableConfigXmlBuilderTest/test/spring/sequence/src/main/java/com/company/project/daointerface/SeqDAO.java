package com.company.project.daointerface;

import org.springframework.dao.DataAccessException;

/**
 * A dao interface provides methods to access all <tt>SEQUENCE</tt> objects.
 *
#parse("description-java.vm")
 */
public interface SeqDAO {
    
    public long getNextSeqBbccCustomer() throws DataAccessException;
    

    public long getNextList,list() throws DataAccessException;
    
}