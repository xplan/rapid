	/**
	 * 
	 * sql: 
    insert 
    into
        user_info
        
    values
        (?,?,?,?,?,?)
	 */
	public int testInsertSqlWithRightName(TestInsertSqlWithRightNameParameter param) {
		return userInfoBlogDAO.testInsertSqlWithRightName(param);
	}

