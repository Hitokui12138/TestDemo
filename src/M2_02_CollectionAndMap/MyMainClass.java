package M2_02_CollectionAndMap;

import java.util.*;

public class MyMainClass {
	public static void main(String[] args) {
		/*
		 * 1.1 LinkedList ListIterator
		 */
		
		/*
		 * 1.2 ArrayList Vector
		 */
		/*
		 * 2.1 HashSet ->Test RemoveDuplicate
		 */
		
		/*
		 * 2.2 TreeSet Comparable Comparator
		 * 有序集合，必须使用可以比较的元素
		 */
		Set<TreeSetItem> parts = new TreeSet<>();
		parts.add(new TreeSetItem("BBB",8901));
		parts.add(new TreeSetItem("CCC",1234));
		parts.add(new TreeSetItem("AAA",4567));
		//2.2.1 按照默认的CompareTo方法来排序输出
		System.out.println(parts);
		Iterator<TreeSetItem> it1 = parts.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		//2.2.2 按照给定的Comparator方法进行排序
		Set<TreeSetItem> parts2 = new TreeSet<>(Comparator.comparing(TreeSetItem::getDescription));
		parts2.addAll(parts);
		System.out.println(parts2);
		Iterator<TreeSetItem> it2 = parts2.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		/*
		 * 3.1 HashMap
		 */
		HashMap<String,String> countries = new HashMap<>();
        countries.put("Washington", "America");
        countries.put("Canberra", "Australia");
        countries.put("Madrid", "Spain");
        System.out.println(countries);
        String returnedValue = countries.merge("Washington", "USA", (oldValue, newValue) -> oldValue + "/" + newValue);
        System.out.println("Washington: " + returnedValue);
        System.out.println("Updated HashMap: " + countries);
		
		
		
		
	}
}
