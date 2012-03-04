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
        and age = ? 
        and sex = ? 
        and birth_date > ? 
        and birth_date < ?
	 */
	public UserInfo testSelectWithCannotGuessColumnType(TestSelectWithCannotGuessColumnTypeQuery param) {
		return userInfoBlogDAO.testSelectWithCannotGuessColumnType(param);
	}


