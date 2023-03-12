package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		Set<String> pageKeySet = new HashSet<String>();
		String[] keysValuesList = new String[]{"1","1","1","1","2","2","3","3"};
		for (int i = 0; i < keysValuesList.length; i++) {
			StringBuffer keysValuesString = new StringBuffer();
							//把多个property的值拼接起来用于比较
				keysValuesString.append(keysValuesList[i]);		//把这个property的值设给keysValuesString
			
			boolean isKeyAdded = pageKeySet.add(keysValuesString.toString());
			System.out.println(isKeyAdded);
			if (!isKeyAdded) {
				keysValuesList[i] = "0";
			}

		}
		System.out.println("1.用foreach打印");
		for (String j : pageKeySet) {
			System.out.println(j);
		}
		
		System.out.println("2.用Iterator打印");
		Iterator<String> it = pageKeySet.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		

	}
}
