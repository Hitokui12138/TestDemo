package M1_05_Generics;
/**
 * 列阵方法,泛型方法
 * 获取类型为T的中的列表的最大值和最小值
 * T的类型由调用方决定
 * 将一对最大最小值,或null,保存在Pair对象里,并返回给调用方
 * 限制T必须是实现了Comparable的类,LocalDate实现了Comparable
 * @author peihang.gu
 *
 */
public class ArrayAlg {
	public static <T extends Comparable> Pair<T> minmax(T[] a){
		if(a == null || a.length == 0) {
			return null;
		}
		T min = a[0];
		T max = a[1];
		
		for(int i = 1; i < a.length; i++) {
			if(min.compareTo(a[i]) > 0) {
				min = a[i];
			}
			if(max.compareTo(a[i]) < 0) {
				max = a[i];
			}
		}
		return new Pair<T>(min,max);
	}
}
