package M1_02_Anonymousclass;

/* 实现一个类包含另一个类,随时重写一个方法,又不需要定义子类来实例化
 * 主要是用于在我们需要的时候创建一个对象来执行特定的任务，可以使代码更加简洁。
 * 本质上是对父类方法的重写或接口方法的实现
 * 不能继承类，也不能实现接口
 * tips:Lambda优于匿名类
 */

public class MyMainClass {
	public static void main(String[] args) {
		Child a = new Child();
		a.display();//1.用子类重写了父类方法
		
		//2.使用匿名类直接重写父类方法,省去子类
		SuperClass s = new SuperClass() { //只能通过父类构造方法实例化
			@Override
			public void display() {
				System.out.println("使用匿名类重写父类方法"+Math.random());
			}
		};//注意这里的分号
		s.display();
	}
}
