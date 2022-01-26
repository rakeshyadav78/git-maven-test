package com.tgd.test;

import java.util.HashMap;

import com.tgd.test.util.TestUtil;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class Test {
	private static TestUtil testUtil = TestUtil.getInstance();

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = TestUtil.checkCharOccurence("Raakeshs");
		log.info("Map Size : " + hashMap.size());
		hashMap.entrySet().stream().forEach(entry -> {
			System.out.println("Key : " + entry.getKey() + ", Value : " + entry.getValue());
		});
	}
}
