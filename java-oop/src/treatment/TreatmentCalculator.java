package treatment;
/**
 * 待遇計算インターフェース
 * @author imagepit
 */
public interface TreatmentCalculator {
	/**
	 * 給与計算
	 * @return 給与額
	 */
	int salary();
	/**
	 * ボーナス
	 * @return ボーナス価格
	 */
	int bonus();
	/**
	 * 有給休暇
	 * @return
	 */
	int paydHoliday();
}
