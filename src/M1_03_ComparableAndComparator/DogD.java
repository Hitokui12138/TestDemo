package M1_03_ComparableAndComparator;

public class DogD {
	String name;
	int age;
	
	public DogD(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//为了方便打印,覆盖toString
	public String toString() {
		return "Dog{" + "name='" + name + "\'," +"age='" +age+"'}";
	}
}
