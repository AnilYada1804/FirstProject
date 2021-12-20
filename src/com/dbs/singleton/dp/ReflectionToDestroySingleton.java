package com.dbs.singleton.dp;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionToDestroySingleton {
	public static void main(String[] args) {
		BillPughSingleton ob1 = BillPughSingleton.getInstance();
		
		BillPughSingleton ob2 = null;
		Constructor[] constructors = BillPughSingleton.class.getDeclaredConstructors();
		for(Constructor con : constructors) {
			con.setAccessible(true);
			try {
				ob2 = (BillPughSingleton)con.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(ob1.hashCode());
		System.out.println(ob2.hashCode());
	}
}
