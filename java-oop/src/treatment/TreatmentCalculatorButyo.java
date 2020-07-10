package treatment;

/**
 * 部長用待遇計算クラス
 * @author imagepit
 *
 */
public class TreatmentCalculatorButyo implements TreatmentCalculator{

	@Override
	public int salary() {
		return 600000;
	}

	@Override
	public int bonus() {
		return 1200000;
	}

	@Override
	public int paydHoliday() {
		return 5;
	}

}
