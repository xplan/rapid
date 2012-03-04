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
	public UserInfo testSelectWithInParameers(String username ,String password ,java.util.List<Integer> age ) {
		return userInfoBlogDAO.testSelectWithInParameers(username,password,age);
	}


