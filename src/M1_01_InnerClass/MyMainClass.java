package M1_01_InnerClass;
/**
 * 内部类的作用:1.像文件夹一样结构清晰
 * 2.private私有内部类更安全
 */
import M1_01_InnerClass.OuterClass3.InnerClass3;

public class MyMainClass {
	public static void main(String[] args) {
		//1.一般内部类
		OuterClass1 outer1 = new OuterClass1();
		OuterClass1.InnerClass1 inner1 = outer1.new InnerClass1();//注意这里的语法
		System.out.println(outer1.x + inner1.y);
		
		//2.私有内部类
		OuterClass2 outer2 = new OuterClass2();
		//OuterClass2.InnerClass2 inner2 = outer1.new InnerClass2(); //无法在外部使用私有内部类
		//System.out.println(outer2.x + inner2.y);
		
		OuterClass3 outer3 = new OuterClass3();
		//OuterClass3.InnerClass3 inner3 = outer3.new InnerClass3(); //不能使用outer实例来调用静态Inner的构造函数
		OuterClass3.InnerClass3 inner3 = new OuterClass3.InnerClass3();//使用外部类名来调用
		InnerClass3 inner4 = new InnerClass3();//或者直接看做一个正常的类
		System.out.println(outer3.x + inner3.y);
		System.out.println(outer3.x + inner4.y);
	}
}
