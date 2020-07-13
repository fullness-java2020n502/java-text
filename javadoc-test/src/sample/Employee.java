package sample;

/**
 * 社員クラス
 * @author imagepit
 */
public class Employee {

	/** 社員番号 */
	private int empNo;
	/** 社員名 */
	private String empName;

	/**
	 * 社員番号を取得（ゲッター）
	 * @return 社員番号
	 */
	public int getEmpNo() {
		return empNo;
	}
	/**
	 * 社員番号を更新（セッター）
	 * @param empNo 社員番号
	 */
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	/**
	 * 社員名を取得（ゲッター）
	 * @return 社員名
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * 社員名を更新（セッター）
	 * @param empName 社員名
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

}
