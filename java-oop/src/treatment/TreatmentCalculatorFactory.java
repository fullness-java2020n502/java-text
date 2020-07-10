package treatment;

public class TreatmentCalculatorFactory {
	public static TreatmentCalculator createCalculator(String position) {
		switch(position) {
		case "社長":
			return new TreatmentCalculatorCEO();
		case "部長":
			return new TreatmentCalculatorButyo();
		case "係長":
			return new TreatmentCalculatorKakarityo();
		case "一般":
			return new TreatmentCalculatorNormal();
		default:
			return new TreatmentCalculatorNormal();
		}
	}
}
