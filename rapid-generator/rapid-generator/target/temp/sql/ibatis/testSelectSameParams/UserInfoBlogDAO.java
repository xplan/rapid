
	/**
	 * Blog操作
	 * sql: 
    select
        * 
    from
        user_info 
    where
        username = ? 
        and username like ? 
        and birth_date between ? and ?
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testSelectSameParams(String username ,java.sql.Date birthDate ) {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("birthDate",birthDate);
		return (UserInfo)getSqlMapClientTemplate().queryForObject("testSelectSameParams",param);
	}

