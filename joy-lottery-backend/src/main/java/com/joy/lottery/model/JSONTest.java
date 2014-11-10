package com.joy.lottery.model;

import com.alibaba.fastjson.JSONObject;

public class JSONTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lottery lottery1 = new Lottery();
		lottery1.setId(0);
		lottery1.setName("二等奖");
		lottery1.setImage("image1");
		lottery1.setMusic(true);
		lottery1.setNumbers(10);
		lottery1.setRule(true);
		lottery1.setDesc("hahahha");

		Lottery lottery2 = new Lottery();
		lottery2.setId(1);
		lottery2.setName("一等奖");
		lottery2.setImage("image2");
		lottery2.setMusic(true);
		lottery2.setNumbers(2);
		lottery2.setRule(false);
		lottery2.setDesc("yayayyayayay");

		System.out.println(JSONObject.toJSONString(lottery1));
	}

}
