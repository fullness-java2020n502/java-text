package treatment;
/**
 * 社長用待遇計算クラス
 * @author imagepit
 *
 */
public class TreatmentCalculatorCEO implements TreatmentCalculator{
	@Override
	public int salary() {
		return 1000000;
	}
	@Override
	public int bonus() {
		return 2000000;
	}
	@Override
	public int paydHoliday() {
		return 10;
	}
}
