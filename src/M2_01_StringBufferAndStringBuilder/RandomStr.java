package M2_01_StringBufferAndStringBuilder;

/**
 * 首先要知道a-z所对应的数字的区间 a-z:97~122;A-Z:65~90;0-9:48~57
 */

import java.util.Random;

public class RandomStr {
	static String getRandomStr(int length) {
		Random random1 = new Random();
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < length; i++) {
			//分为a-z;A-Z;0-9;三种情况,每次随机一种
			int num = random1.nextInt(3);
			long result = 0;
			switch(num) {
			//a-z
			case 0:
				result = random1.nextInt(122-97)+97;
				sb.append(String.valueOf((char)result));
				break;
			//A-Z
			case 1:
				result = random1.nextInt(90-65)+65;
				sb.append(String.valueOf((char)result));
				break;
			//0-9
			case 2:
				result = random1.nextInt(57-48)+48;
				sb.append(String.valueOf((char)result));
				break;
			}
		}
		return sb.toString();
	}
}
