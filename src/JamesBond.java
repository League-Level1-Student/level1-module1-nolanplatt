public class JamesBond {

		
		public static void main(String[] args) {

			Vault vault = new Vault();
			//vault.setCode("test");
			
			//vault.tryCode(321);
			
 	}
		
		public int findCode(Vault vault) {

			for (int i = 0; i < 1000000; i++) {
				boolean itWorked = vault.tryCode(i);
				
				if(itWorked) {
					System.out.println("found - code: "+i);
					return i;
				}
				//System.out.println("didn't find");
				
			}
			return -1;
			
		}

}
