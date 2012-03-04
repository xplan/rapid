package com.company.project.ibatis;

import com.company.project.daointerface.SeqDAO;
import org.springframework.dao.DataAccessException;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

public class IbatisSeqDAO extends SqlMapClientDaoSupport implements SeqDAO {
    
    
    public long getNextSeqBbccCustomer() throws DataAccessException {
        return ((Number) getSqlMapClientTemplate().queryForObject("SEQ.SEQ_BBCC_CUSTOMER", null)).longValue();
    }    

    
    public long getNextList,list() throws DataAccessException {
        return ((Number) getSqlMapClientTemplate().queryForObject("SEQ.list,list", null)).longValue();
    }    
}