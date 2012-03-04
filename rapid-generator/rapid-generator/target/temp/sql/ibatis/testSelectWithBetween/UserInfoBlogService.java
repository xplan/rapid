	/**
	 * Blog操作
	 * sql: 
    select
        * 
    from
        user_info 
    where
        birth_date between ? and ? 
        and username = ? 
        and sex <= ? 
        and age >= ? 
        and password <> ?
	 */
	public UserInfo testSelectWithBetween(TestSelectWithBetweenQuery param) {
		return userInfoBlogDAO.testSelectWithBetween(param);
	}


