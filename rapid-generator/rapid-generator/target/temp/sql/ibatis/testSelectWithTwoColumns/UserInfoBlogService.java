	/**
	 * 
	 * sql: 
    select
        sum(age) sum_age,count(username) cnt 
    from
        user_info 
	 */
	public TestSelectWithTwoColumnsResult testSelectWithTwoColumns() {
		return userInfoBlogDAO.testSelectWithTwoColumns();
	}


