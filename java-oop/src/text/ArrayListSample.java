package text;

import java.util.ArrayList;
import java.util.List;

import practice01.Employee;

public class ArrayListSample {
	public static void main(String[] args) {
		// 基本データ型のコレクションの場合はラッパークラスを使う
		List<Integer> strings = new ArrayList<>();
		// 要素を動的に追加
		strings.add(1);
		strings.add(2);
		strings.add(3);
		strings.add(4);
		strings.add(5);
		// 要素数の確認
		System.out.println(strings.size()); // 5
		// 一つの要素を取得
		System.out.println(strings.get(0)); // 1
		// 繰り返し処理
		for (Integer num : strings) {
			System.out.println(num);
		}

		// （独自）クラスの参照型のコレクションを作成する場合
		// 【重要】DBからSELECT文で取得したデータをArrayListに格納します
		List<Employee> employees = new ArrayList<>();
		Employee emp1 = new Employee();
		emp1.empName = "takahashi";
		emp1.empNo = 1;
		employees.add(emp1); // コレクションに動的に追加
		Employee emp2 = new Employee();
		emp2.empName = "suzuki";
		emp2.empNo = 2;
		employees.add(emp2);
		Employee emp3 = new Employee();
		emp3.empName = "sato";
		emp3.empNo = 3;
		employees.add(emp3);
		// 繰り返し
		for (Employee employee : employees) {
			System.out.println("社員番号:"+employee.empNo);
			System.out.println("社員名:"+employee.empName);
		}


	}
}
