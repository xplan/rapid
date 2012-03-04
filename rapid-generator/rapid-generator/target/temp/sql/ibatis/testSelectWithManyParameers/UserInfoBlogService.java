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
        and age = ? 
        and sex = ? 
        and birth_date > ? 
        and birth_date < ?
	 */
	public UserInfo testSelectWithManyParameers(TestSelectWithManyParameersQuery param) {
		return userInfoBlogDAO.testSelectWithManyParameers(param);
	}


