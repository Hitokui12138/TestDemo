package M1_03_ComparableAndComparator;

import java.util.Comparator;

/**
 * Comparator
 * 1.在原本的类里建一个内部类Comparator,为了方便调用使用静态内部类
 * 2.子类需要implements Comparator
 * 3.子类需要重写Compare()方法
 * 4.延申:使用Lambda表达式改写Comparator
 * @author peihang.gu
 *
 */
public class DogB {
	String name;
	int age;
	
	public DogB(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//为了方便打印,覆盖toString
	@Override
	public String toString() {
		return "Dog{" + "name='" + name + "\'," +"age='" +age+"'}";
	}
	
	/*
	 * 为了方便调用使用了静态内部类
	 * 也可以在Main方法里用Lambda定义这个比较器
	 */
	static class DogComparator implements Comparator<DogB>{
		public int compare(DogB d1,DogB d2) {	//返回一个int
			return d1.name.length() - d2.name.length();
		}
	}
	
}
