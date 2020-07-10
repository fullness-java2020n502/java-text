package treatment;
/**
 *
 * @author imagepit
 *
 */
public class TreatmentCalculatorKakarityo implements TreatmentCalculator{

	@Override
	public int salary() {
		return 400000;
	}

	@Override
	public int bonus() {
		return 800000;
	}

	@Override
	public int paydHoliday() {
		return 4;
	}

}
