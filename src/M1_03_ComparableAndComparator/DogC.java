package M1_03_ComparableAndComparator;
/**
 * 演示匿名类实现DogC的Comparator
 * 只需要一次用到自定义比较规则的compare方法
 * 而DogC什么都不需要定义
 * @author peihang.gu
 *
 */
public class DogC {
	String name;
	int age;
	
	public DogC(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//为了方便打印,覆盖toString
	public String toString() {
		return "Dog{" + "name='" + name + "\'," +"age='" +age+"'}";
	}
}
