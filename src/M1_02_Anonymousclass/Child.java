package M1_02_Anonymousclass;
/**
 * 1.这里的这个类只是个子类,用子类改写父类方法
 * @author peihang.gu
 *
 */
public class Child extends SuperClass{ 
	@Override
	public void display() {
		System.out.println("在子类内部");
	}
}
