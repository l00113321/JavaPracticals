package lyit;

public class Joint extends Account {
	
		private Name nameB;
		
		public Joint(){
			super();
			nameB = new Name();
		}

		public Joint(String t1, String fN1, String sn1,  
				 String t2, String fN2, String sn2,     
				 String address, double balance, 
	             int day, int month, int year){
		super(t1, fN1, sn1, address, balance, day, month, year);		
    	nameB = new Name(t2,fN2,sn2);
		}

		@Override
		public String toString() {
			return ("ACCOUNT==>"+ accountNo + ":" + name + " & " + nameB + "," + address + "," + balance);
		}

		public Name getNameB() {
			return nameB;
		}

		public void setNameB(Name nameB) {
			this.nameB = nameB;
		}

		
		
		
}
