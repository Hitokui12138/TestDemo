package Test;

public class SwitchTest {
	public static void main(String[] args) {
		int i = 5;
		switch(i){
			default:
				System.out.println("default");//因为没有break，执行到这里时会穿透到case0
			case 0:
				System.out.println(0);
				break;//在这里break
			case 1:
				System.out.println(0);
				break;	
		}
	}
}
