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
	public int testUpdateSql(String username ,String password ,Integer age ,Byte sex ) {
		return userInfoBlogDAO.testUpdateSql(username,password,age,sex);
	}


