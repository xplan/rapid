	/**
	 * 
	 * sql: 
    select
        username 
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
	public String testSelectStringAndMultiPolicyOne(TestSelectStringAndMultiPolicyOneQuery param) {
		return userInfoBlogDAO.testSelectStringAndMultiPolicyOne(param);
	}


