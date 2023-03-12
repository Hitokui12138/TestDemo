package M1_05_Generics;
/**
 * 泛型类,或者泛型接口
 * 一个总是有一对数据的对象
 * @author peihang.gu
 *
 * @param <T>
 */

public class Pair<T> { //这个类包含一个类型T,而T由调用方决定
	private T first;
	private T second;
	
	//两中构造方法
	public Pair() {
		first = null;
		second = null;
	}
	public Pair(T first,T second) {
		this.first = first;
		this.second = second;
	}
	
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	
}
