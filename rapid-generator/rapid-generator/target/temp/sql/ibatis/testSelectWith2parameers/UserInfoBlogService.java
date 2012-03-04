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
	public UserInfo testSelectWith2parameers(String username ,String password ) {
		return userInfoBlogDAO.testSelectWith2parameers(username,password);
	}


