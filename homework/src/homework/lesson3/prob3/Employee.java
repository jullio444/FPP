package homework.lesson3.prob3;

import java.time.LocalDate;

public class Employee {
	private Account savingsAcct;
	private Account checkingAcct;
	private Account retirementAcct;
	private String name;
	private LocalDate hireDate;

	public Employee(String name, int yearOfHire, int monthOfHire, int dayOfHire) {
		this.name = name;
		// Replace these lines with LocalDate references
		// GregorianCalendar cal =
		this.hireDate = LocalDate.of(yearOfHire, monthOfHire, dayOfHire);

	}

	public void createNewChecking(double startAmount) {
		// implement
		this.checkingAcct = new Account(this, AccountType.CHECKING, startAmount);
	}

	public void createNewSavings(double startAmount) {
		// implement
		this.savingsAcct = new Account(this, AccountType.SAVINGS, startAmount);
	}

	public void createNewRetirement(double startAmount) {
		// implement
		this.retirementAcct = new Account(this, AccountType.RETIREMENT, startAmount);
	}

	public void deposit(AccountType acctType, double amt) {
		// implement
		switch (acctType) {
		case CHECKING:
			this.checkingAcct.makeDeposit(amt);
		case SAVINGS:
			this.savingsAcct.makeDeposit(amt);
		case RETIREMENT:
			this.retirementAcct.makeDeposit(amt);
			break;
		default:
			System.err.println("Invalid Account");

		}
		
	}

	public boolean withdraw(AccountType acctType, double amt) {
		// implement
		boolean st = false;
		switch (acctType) {
		case CHECKING:
			st = this.checkingAcct.makeWithdrawal(amt);
			break;
		case SAVINGS:
			st = this.savingsAcct.makeWithdrawal(amt);
			break;
		case RETIREMENT:
			st = this.retirementAcct.makeWithdrawal(amt);
			break;
		default: 
			System.err.println("Invalid Account");
			break;
		}
		return st;
	}

	public String getFormattedAcctInfo() {
		// implement
		StringBuilder acctInfo = new StringBuilder();
		acctInfo.append("\n\nACCOUNT INFO FOR " + name + "\n\n");
		if (checkingAcct != null)
			acctInfo.append(checkingAcct.toString()+"\n");
		if (savingsAcct != null)
			acctInfo.append(savingsAcct.toString()+"\n");
		if (retirementAcct != null)
			acctInfo.append(retirementAcct.toString()+"\n");
		return acctInfo.toString();
	}
}