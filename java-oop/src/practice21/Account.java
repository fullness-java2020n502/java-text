package practice21;

public class Account {
	private int accountNo;
	private int balance;
	public Account(int accountNo) {
		this.accountNo = accountNo;
		this.balance = 0;
	}
	/**
	 * 引数が0以下の場合は独自例外を送出するメソッド
	 * @param balance
	 * @throws IllegalDebidException
	 */
	public void addBalence(int balance) throws IllegalDebidException {
		if(balance <= 0) { throw new IllegalDebidException();}
		this.balance += balance;
	}
	public int getAccountNo() {
		return this.accountNo;
	}
	public int getBalance() {
		return this.balance;
	}
}
