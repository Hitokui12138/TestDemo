package M1_03_ComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

public class MyMainClass {
	public static void main(String[] args) {
		//1.Comparable
		DogA[] dogs = {
				new DogA("aaa",2),
				new DogA("b",3),
				new DogA("cc",1)};
		
		Arrays.sort(dogs);	//直接sort数组
		System.out.println(Arrays.toString(dogs));
		
		//2.Comparator
		DogB[] dogs2 = {
				new DogB("aaa",2),
				new DogB("b",3),
				new DogB("cc",1)};
		
		//sort()里加上第二个参数比较器对象
		Arrays.sort(dogs2,new DogB.DogComparator());	//Dog2在类里定义了比较器,这里new了一个比较器对象
		System.out.println(Arrays.toString(dogs2));
		
		//3.用匿名类实现Comparator
		DogC[] dogs3 = {
				new DogC("aaa",2),
				new DogC("b",3),
				new DogC("cc",1)};
		
		Arrays.sort(dogs3,new Comparator<DogC>(){	//匿名类,Dog3没有定义比较器,这里使用匿名类定义比较器
			@Override
			public int compare(DogC A, DogC B) {
				return A.age-B.age;
			}
		});
		
		
		//4.Lambda优于匿名类
		DogD[] dogs4 = {
				new DogD("aaa",2),
				new DogD("b",3),
				new DogD("cc",1)};
		//Arrays.sort(dogs4,(A,B)->{A.age-B.age}); 注意大小括号不要写错了
		Arrays.sort(dogs4,(A,B)->(A.age-B.age));	//Dog4没有定义比较器,这里使用Lambda表达式代替匿名类
		System.out.println(Arrays.toString(dogs));
		
	}
}
