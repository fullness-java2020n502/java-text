package practice17;

public class NetAccount extends Account{
	@Override
	public void print() {
		System.out.println("インターネット口座");
		super.print();
	}
}
