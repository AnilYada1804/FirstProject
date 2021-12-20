package com.dbs.observer;

public class TestObserverPattern {
	// For Example, Company updates all its shareholders for any decision they make
	// here Company is Subject and Shareholders are Observers,
	// any change in the policy of company and the Company notifies all its
	// Shareholders or Observer.
	// This was a simple real-world explanation of the Observer pattern.

	public static void main(String[] args) {
		Loan loan = new Loan("Personal Loan", 12.45f, "SBI");
		Newspaper newspaper = new Newspaper();
		Internet internet = new Internet();

		loan.registerObserver(newspaper);
		loan.registerObserver(internet);
		loan.setInterest(3.5f);

		loan.notifyObserver();
	}
}

class Newspaper implements Observer {
	@Override
	public void update(float interest) {
		System.out.println("Newspaper: Interest Rate updated, new Rate is: " + interest);
	}
}

class Internet implements Observer {
	@Override
	public void update(float interest) {
		System.out.println("Internet: Interest Rate updated, new Rate is: " + interest);
	}
}