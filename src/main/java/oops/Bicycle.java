package oops;

public class Bicycle {
	
	// Method Signature
	// access modifier  -- return type -- method name ( arguments)
	
	public void getColor() {
		System.out.println("White");
	}
	
	public void getColor(String brand) {
		if(brand.equals("BSA")) {
			System.out.println("Orange");
		}else {
			System.out.println("Grey");
		}
	}
	
	
	

}
