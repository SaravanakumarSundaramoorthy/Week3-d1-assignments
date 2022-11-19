package org.Bank;

public class AxisBank extends BankInfo {

	public void deposit() {
		System.out.println("Desposit amount is 2000");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AxisBank axis = new AxisBank();

		axis.savings();
		axis.fixed();
		axis.deposit();
	}

}
