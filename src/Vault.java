import java.util.Random;

public class Vault {
public int codeVault;

	Vault() {
		Random random = new Random();
		codeVault = random.nextInt(1000000);
		
	}
	
	
	public void setCode(int code) {
		codeVault = code;
		System.out.println("code is now "+code);

	}
	
	public boolean tryCode(int code) {
		if(code == codeVault) {
			System.out.println("code worked");
			return true;
		}
		else {
			//System.out.println("code didn't work");
			return false;
		}		
	}
	

}
