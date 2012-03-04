
	/**
	 * Blog操作
	 * sql: 
    delete 
    from
        user_info 
    where
        username = ? 
        and password = ? 
        and age=? 
        and sex=?
	 */
	@SuppressWarnings("unchecked")
	public int testDeleteSql(String username ,String password ,Integer age ,Byte sex ) {
		Map<String,Object> param = new HashMap<String,Object>();
		param.put("username",username);
		param.put("password",password);
		param.put("age",age);
		param.put("sex",sex);
		return getSqlMapClientTemplate().delete("testDeleteSql", param);
	}

