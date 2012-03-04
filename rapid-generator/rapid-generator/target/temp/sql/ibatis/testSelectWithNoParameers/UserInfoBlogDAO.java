
	/**
	 * 
	 * sql: 
    select
        * 
    from
        user_info
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testSelectWithNoParameers() {
		Map<String,Object> param = new HashMap<String,Object>();
		return (UserInfo)getSqlMapClientTemplate().queryForObject("testSelectWithNoParameers",param);
	}

