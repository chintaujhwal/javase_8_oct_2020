package oop;

public class TestAccount {

	public static void main(String[] args) {
		 SavingsAccount s1; // object reference
		 
		 s1 = new SavingsAccount();  // object 
		 // s1.acno = 101;
		 
		 s1.open(1001, "James Gosling"); // call method
		 s1.deposit(20000);
		 s1.print();
		 
		 SavingsAccount s2  = new SavingsAccount();
		 s2.open(1002,"Scott Guthrie");
		 s2.print();
	}
}
