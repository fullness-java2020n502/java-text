package text;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import practice01.Employee;

public class SetDriver {
	public static void main(String[] args) {
		Set<String> list = new HashSet<>();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("c");
		// 繰り返し処理しているときに
		// Iteratorを使って繰り返す事もできます。
		Iterator<String> iterator = list.iterator();
		// 一つ一つ要素を取り出し要素がなくなったらfalse
		while(iterator.hasNext()) { // JDBCのDBからのデータのとり方がこれに近い
			System.out.println(iterator.next());
		}


		// HashMapの例
		Map<String, Employee> empMap = new HashMap<>();
		Employee employee1 = new Employee();
		employee1.empNo = 1;
		employee1.empName = "takahashi";
		Employee employee2 = new Employee();
		employee2.empNo = 2;
		employee2.empName = "sato";
		// HashMapに要素を追加
		empMap.put("高橋", employee1);
		empMap.put("佐藤",employee2);
		// 繰り返し処理
		for (String key : empMap.keySet()) {
			System.out.println(empMap.get(key).empNo);
			System.out.println(empMap.get(key).empName);
		}




	}
}
