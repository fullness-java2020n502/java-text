package treatment;

import java.util.Scanner;
/**
 * 社員待遇プログラム
 * @author imagepit
 */
public class Driver {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("役職を入力（社長、部長、係長、一般）");
		String input1 = scanner.next();
		TreatmentCalculator calculator = TreatmentCalculatorFactory.createCalculator(input1);
		outputSalary(calculator);
		outputBonus(calculator);
		outputPaidHolidays(calculator);
	}

	public static void outputSalary(TreatmentCalculator calculator) {
		System.out.println("給与:" + calculator.salary() + "円");
	}

	public static void outputBonus(TreatmentCalculator calculator) {
		System.out.println("ボーナス:" + calculator.bonus() + "円");
	}

	public static void outputPaidHolidays(TreatmentCalculator calculator) {
		System.out.println("有給休暇:" + calculator.paydHoliday() + "日");
	}
}