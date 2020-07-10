package treatment;

/**
 * 一般用の待遇計算クラス
 * @author imagepit
 *
 */
public class TreatmentCalculatorNormal implements TreatmentCalculator{

	@Override
	public int salary() {
		return 300000;
	}

	@Override
	public int bonus() {
		return 600000;
	}

	@Override
	public int paydHoliday() {
		return 3;
	}

}
