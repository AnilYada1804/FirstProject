package com.dbs.singleton.dp;

import java.util.Objects;

public class LazyInitialization {
	private LazyInitialization() {

	}

	private static LazyInitialization intance;

	public static LazyInitialization getInstance() {
		if (Objects.isNull(intance)) {
			intance = new LazyInitialization();
		}
		return intance;
	}
}
