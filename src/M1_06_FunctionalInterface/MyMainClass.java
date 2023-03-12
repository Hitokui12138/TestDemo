package M1_06_FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * 使用JDK内置的4类函数式接口
 * 有且仅有一个抽象方法的接口
 * StreamAPI常用
 * 最大的作用其实是为了支持行为参数传递，比如传递Lambda、方法引用、函数式接口对应的实例对象等
 * 使用Lambda表达式，就一定要使用函数式接口，因为lambda表达式的本质就是作为函数式接口的实例。
 * @FunctionalInterface注解可以检查它是否是一个函数式接口
 * @author peihang.gu
 *
 */
public class MyMainClass {
	public static void main(String[] args) {
		//1.Consumer  void accept(T t) 消费型接口
		Consumer<Double> consumer = (e)->{	//里面必须写e
			System.out.println("Consumer:"+e);
		};
		consumer.accept(100.0);
		
		//2.Function  R apply(T t) 函数型接口
		String b = "java";
		Function<String,String> function = (t)->t.toUpperCase();
		b = function.apply(b);
		System.out.println("Function:"+b);
		
		//3.Predicate  boolean test(T t) 判断型接口
		Dog c = new Dog("c",10);
		Predicate<Dog> pridicate = (e) -> e.age>5;
		System.out.println("Pridicate:"+pridicate.test(c));
		
		//4.Supplier  T get() 供给型接口
		Supplier<String> supplier = ()->{
			Dog d = new Dog("d",5);
			return d.name;
		};
		System.out.println("Supplier:"+ supplier.get());
	}
}
