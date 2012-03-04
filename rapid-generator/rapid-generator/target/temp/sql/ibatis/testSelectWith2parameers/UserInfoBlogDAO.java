
	/**
	 * Blog操作
	 * sql: 
    select
        * 
    from
        user_info 
    where
        username = ? 
        and password =? 
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testSelectWith2parameers(String username ,String password ) {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		return (UserInfo)getSqlMapClientTemplate().queryForObject("testSelectWith2parameers",param);
	}

