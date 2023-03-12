package M1_04_Lambda;

public class Dog{
	String name;
	int age;
	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//为了方便打印,覆盖toString
	public String toString() {
		return "Dog{" + "name='" + name + "\'," +"age='" +age+"'}";
	}
}