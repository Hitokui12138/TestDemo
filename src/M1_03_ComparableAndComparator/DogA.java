package M1_03_ComparableAndComparator;

/**
 * Comparable
 * 1.直接用一个普通的类实现Comparable<T>接口
 * 2.必须实现CompareTo()方法
 * @author peihang.gu
 *
 */

public class DogA implements Comparable<DogA>{
	String name;
	int age;
	
	public DogA(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int compareTo(DogA d) {	//返回一个int
		return age - d.age;
	}
	
	//为了方便打印,覆盖toString
	public String toString() {
		return "Dog{" + "name='" + name + "\'," +"age='" +age+"'}";
	}
}
