
	/**
	 * Blog操作
	 * sql: 
    update
        user_info 
    set
        username = ? 
    where
        password = ? 
        and age=? 
        and sex=?
	 */
	@SuppressWarnings("unchecked")
	public int testUpdateSql(String username ,String password ,Integer age ,Byte sex ) {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("age",age);
		param.put("sex",sex);
		return getSqlMapClientTemplate().update("testUpdateSql", param);
	}

