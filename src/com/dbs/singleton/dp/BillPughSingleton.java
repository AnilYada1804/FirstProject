package com.dbs.singleton.dp;

public class BillPughSingleton {
	private BillPughSingleton() {
		
	}
	private static class BillPughSingletonHelper {
		private static final BillPughSingleton instance = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return BillPughSingletonHelper.instance;
	}

}

class BillPughSingletonExample{
	
	private BillPughSingletonExample() {
		
	}
	
	private static class BillPughSingletonHelper{
		private static final BillPughSingletonExample instance = new BillPughSingletonExample();
	}
	
	public static BillPughSingletonExample getInstance() {
		return BillPughSingletonHelper.instance;
	}
}