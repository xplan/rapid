


public class TestSelectWithBetweenQuery extends BaseQuery {
		private java.sql.Date minBirthDate;
		private java.sql.Date maxBirthDate;
		private String specialUsername;
		private Byte specialSex;
		private Integer specialAge;
		private String password;
	
		public java.sql.Date getMinBirthDate() {
			return minBirthDate;
		}
		public void setMinBirthDate(java.sql.Date v) {
			this.minBirthDate = v;
		}
		public java.sql.Date getMaxBirthDate() {
			return maxBirthDate;
		}
		public void setMaxBirthDate(java.sql.Date v) {
			this.maxBirthDate = v;
		}
		public String getSpecialUsername() {
			return specialUsername;
		}
		public void setSpecialUsername(String v) {
			this.specialUsername = v;
		}
		public Byte getSpecialSex() {
			return specialSex;
		}
		public void setSpecialSex(Byte v) {
			this.specialSex = v;
		}
		public Integer getSpecialAge() {
			return specialAge;
		}
		public void setSpecialAge(Integer v) {
			this.specialAge = v;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String v) {
			this.password = v;
		}
}
