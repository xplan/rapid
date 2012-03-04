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
	public UserInfo testSelectSameParams(String username ,java.sql.Date birthDate ) {
		return userInfoBlogDAO.testSelectSameParams(username,birthDate);
	}


