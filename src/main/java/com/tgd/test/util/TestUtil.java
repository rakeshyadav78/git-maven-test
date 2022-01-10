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

	public static synchronized HashMap<String, Integer> checkCharOccurence(String value) {
		log.info("Input String : " + value);
		HashMap<String, Integer> hashMap = null;
		try {
			if (value != null && !value.isBlank()) {
				char[] nameArray = value.toCharArray();
				hashMap = new HashMap<String, Integer>(16, 0.5f);
				for (char c : nameArray) {
					String key = String.valueOf(c);
					if (hashMap.containsKey(key)) {
						hashMap.put(key, hashMap.get(key) + 1);
					} else {
						hashMap.computeIfAbsent(key, v -> 1);
					}
				}
			} else {
				log.warn("Invalid Input");
				return null;
			}

		} catch (Exception e) {
			log.error("Error Occured : ", e);
			return null;
		}
		return hashMap;
	}

}
