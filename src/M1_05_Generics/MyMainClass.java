package M1_05_Generics;
/**
 * 使用泛型方法和泛型类获取一组LocalDate中最小和最大日期
 */
import java.time.LocalDate;

public class MyMainClass {

	public static void main(String[] args) {
		LocalDate[] birthday= {
				LocalDate.of(1906,12,9),
				LocalDate.of(1815,12,10),
				LocalDate.of(1903,12,3),
				LocalDate.of(1910,6,22),
		};
		
		Pair<LocalDate> pair = ArrayAlg.minmax(birthday);
		System.out.println("min = " + pair.getFirst());
		System.out.println("max = " + pair.getSecond());
		
	}
}
