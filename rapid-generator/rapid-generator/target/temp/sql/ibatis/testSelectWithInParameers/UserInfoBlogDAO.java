
	/**
	 * 
	 * sql: 
    select
        * 
    from
        user_info 
    where
        username = ? 
        and password =? 
        and age in (
            ?
        )
	 */
	@SuppressWarnings("unchecked")
	public UserInfo testSelectWithInParameers(String username ,String password ,java.util.List<Integer> age ) {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("age",age);
		return (UserInfo)getSqlMapClientTemplate().queryForObject("testSelectWithInParameers",param);
	}

