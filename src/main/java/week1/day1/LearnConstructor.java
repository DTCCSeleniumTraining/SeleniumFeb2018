package week1.day1;

public class LearnConstructor {

	public static void main(String[] args) {
		LearnConstructor l = new LearnConstructor();
		LearnConstructor l1 = new LearnConstructor("hi");
	}
	public LearnConstructor(){
		System.out.println("im in cons");
	}
	public LearnConstructor(String par){

		System.out.println("im in cons with para"+par);
	}



}
