package day1.entity;

public class Customer {
		
		//Usual class and object 
		int aid;
		String aname;
		String acity;
	
		private int cid;
		private String cname;
		private String city;
		
		//Using Getter and Setter
		
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		public String getCname() {
			return cname;
		}
		public void setCname(String cname) {
			this.cname = cname;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		
		//Using ToString
		
		@Override
		public String toString() {
			return "Customer [cid=" + cid + ", cname=" + cname + ", city=" + city + "]";
		}
		
		
		

}
