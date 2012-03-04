
	/**
	 * 
	 * sql: 
    select
        sum(age) sum_age,count(username) cnt 
    from
        user_info 
	 */
	@SuppressWarnings("unchecked")
	public TestSelectWithTwoColumnsResult testSelectWithTwoColumns() {
		Map<String,Object> param = new HashMap<String,Object>();
		return (TestSelectWithTwoColumnsResult)getSqlMapClientTemplate().queryForObject("testSelectWithTwoColumns",param);
	}

