package homework.lesson3.prob2;

import java.util.Scanner;

public class CheckProg2 {
	public static void main(String[] args) {

		Employee emp = new Employee("Julius", "Ceaser", 400, 2019, 8, 27);

		Account checking = new Account(emp, AccountType.CHECKING, 300);
		Account savings = new Account(emp, AccountType.SAVINGS, 300);
		Account retirement = new Account(emp, AccountType.RETIREMENT, 300);
		
		System.out.println("Before Making deposit and Withdrawal\n");
		System.out.println(checking);
		System.out.println(savings);
		System.out.println(retirement+"\n");
		
		checking.makeDeposit(500);
		checking.makeWithdrawal(600);
		savings.makeDeposit(50);
		savings.makeWithdrawal(600);
		retirement.makeDeposit(100);
		retirement.makeWithdrawal(600);
		
		System.out.println("After Making deposit and Withdraw\n");
		System.out.println(checking);
		System.out.println(savings);
		System.out.println(retirement);

		
	}
}
	/*
	 *Before Making deposit and Withdrawal
	 *
	 *type = CHECKING, balance = 300.0
	 *type = SAVINGS, balance = 300.0
	 *type = RETIREMENT, balance = 300.0
	 *
	*After Making deposit and Withdraw
	*
	*type = CHECKING, balance = 200.0
	*type = SAVINGS, balance = 350.0
	*type = RETIREMENT, balance = 400.0
	*/