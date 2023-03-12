package M1_04_Lambda;

import java.util.Arrays;
import java.util.Comparator;

/**
 * java 里面使用 lambda 表达式最方便莫过于用来写 Comparator 表达式了.
 * Lambda 表达式把函数作为一个方法的参数
 * @author peihang.gu
 *
 */
public class MyMainClass {
	public static void main(String[] args) {
		Dog[] dogs = {
				new Dog("aaa",2),
				new Dog("b",3),
				new Dog("cc",1)};
		Cat[] cats = {
				new Cat("ddd",2),
				new Cat("e",3),
				new Cat("ff",1)};
		
		//1.匿名类的方式使用比较器
		Arrays.sort(dogs,new Comparator<Dog>(){
			@Override
			public int compare(Dog A, Dog B) {
				return A.age-B.age;
			}
		});
		System.out.println(Arrays.toString(dogs));
		
		//2.使用Lambda,像接口中的方法是多个参数一个返回值的方法
		//(参数)->{覆盖的方法的内容}
		Arrays.sort(dogs,(A,B)->A.name.length()-B.name.length());
		System.out.println(Arrays.toString(dogs));
		
		//3.方法引用
		//Cat也要排序,如果也是用lambda则和狗的lambda表达式实现函数相同
		//考虑封装成通用方法

	}
	

}
