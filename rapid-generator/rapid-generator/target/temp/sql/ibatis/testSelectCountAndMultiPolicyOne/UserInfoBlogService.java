	/**
	 * Blog操作
	 * sql: 
    select
        count(username) cnt 
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
	public Long testSelectCountAndMultiPolicyOne(TestSelectCountAndMultiPolicyOneQuery param) {
		return userInfoBlogDAO.testSelectCountAndMultiPolicyOne(param);
	}


