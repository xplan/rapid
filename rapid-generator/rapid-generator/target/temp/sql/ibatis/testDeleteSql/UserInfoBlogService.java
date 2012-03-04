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
	public int testDeleteSql(String username ,String password ,Integer age ,Byte sex ) {
		return userInfoBlogDAO.testDeleteSql(username,password,age,sex);
	}


