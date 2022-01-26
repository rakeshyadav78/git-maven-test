package com.tgd.test.util;

import java.util.HashMap;
import java.util.Map;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class TestUtil {

	private static TestUtil instance = null;

	private TestUtil() {

	}

	public static TestUtil getInstance() {
		if (instance == null) {
			synchronized (TestUtil.class) {
				if (instance == null) {
					instance = new TestUtil();
				}
			}
		}
		return null;
	}
}
