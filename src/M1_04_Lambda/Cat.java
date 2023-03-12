package M1_04_Lambda;
/**
 * 用来演示方法引用
 * @author peihang.gu
 *
 */

public class Cat {
	String name;
	int age;
	
	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//为了方便打印,覆盖toString
	public String toString() {
		return "Cat{" + "name='" + name + "\'," +"age='" +age+"'}";
	}
}
