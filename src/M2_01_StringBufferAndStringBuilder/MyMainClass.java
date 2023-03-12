package M2_01_StringBufferAndStringBuilder;

public class MyMainClass {
	public static void main(String[] args) {
		//1.字符串转换为字符列表
		String str1 = "java";
		char[] cs = str1.toCharArray();
		System.out.println("1.字符串转换为字符列表:");
		for(char c : cs) {
			System.out.println(c);
		}
		
		//2.String.format()拼接
		String a = "AAA";
		int b = 3;
		String c = "A";
		String sen2format = "%s里有%d个%s%n";
		String sen2 = String.format(sen2format,a,b,c);
		System.out.println(sen2);
		
		//3.取得任意长度的随机英数字
		System.out.println(RandomStr.getRandomStr(10));
	}
}
