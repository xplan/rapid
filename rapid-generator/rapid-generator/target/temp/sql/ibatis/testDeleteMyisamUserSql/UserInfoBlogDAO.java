
	/**
	 * 
	 * sql: 
    delete 
    from
        user_info 
	 */
	@SuppressWarnings("unchecked")
	public int testDeleteMyisamUserSql() {
		Map<String,Object> param = new HashMap<String,Object>();
		return getSqlMapClientTemplate().delete("testDeleteMyisamUserSql", param);
	}

