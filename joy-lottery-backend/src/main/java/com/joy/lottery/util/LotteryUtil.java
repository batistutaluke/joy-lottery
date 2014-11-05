package com.joy.lottery.util;

import java.util.ArrayList;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class LotteryUtil {

	public static String getProperties(String param) {
		Configuration configuration = null;
		try {
			configuration = new PropertiesConfiguration("config.properties");
		} catch (ConfigurationException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}

		return configuration.getString(param);
	}

	public static ArrayList<String> parseStringArray(String line) {
		String[] values = line.trim().split("-");
		ArrayList<String> array = new ArrayList<>();
		for (int i = 0; i < values.length; i++) {
			array.add(values[i]);
		}

		return array;
	}

	public static ArrayList<Integer> parseIntArray(String line) {
		String[] values = line.trim().split("-");
		ArrayList<Integer> array = new ArrayList<>();
		for (int i = 0; i < values.length; i++) {
			array.add(Integer.parseInt(values[i]));
		}
		return array;
	}

}
