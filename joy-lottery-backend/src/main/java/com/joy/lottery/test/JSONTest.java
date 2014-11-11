package com.joy.lottery.test;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.joy.lottery.model.Lottery;

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
		lottery1.setCapacity(10);
		lottery1.setComplete_once(true);
		lottery1.setDesc("hahahha");

		Lottery lottery2 = new Lottery();
		lottery2.setId(1);
		lottery2.setName("一等奖");
		lottery2.setImage("image2");
		lottery2.setMusic(true);
		lottery2.setCapacity(2);
		lottery2.setComplete_once(false);
		lottery2.setDesc("yayayyayayay");

		List<Lottery> list = new ArrayList<Lottery>();
		list.add(lottery1);
		list.add(lottery2);

		System.out.println(JSONObject.toJSONString(lottery1));
		System.out.println(JSONObject.toJSONString(list));
	}

}
