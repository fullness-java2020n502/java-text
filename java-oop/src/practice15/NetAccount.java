package practice15;

public class NetAccount extends Account{
	public void print() {
		System.out.println("インターネット口座");
		System.out.println("口座番号:"+ this.getAccountNo());
		System.out.println("口座番号:"+ this.getAccountName());
		System.out.println("口座番号:"+ this.getBalance());
	}
}
