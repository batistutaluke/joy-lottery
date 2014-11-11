package com.joy.lottery.test;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang.math.RandomUtils;

import com.alibaba.fastjson.JSONObject;
import com.joy.lottery.model.Lottery;

public class JSONTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Lottery lottery1 = new Lottery();
		lottery1.setId(0);
		lottery1.setName("五等奖");
		lottery1.setImage("image5");
		lottery1.setTitleImage("5等奖名称图片");
		lottery1.setMusic(true);
		lottery1.setCapacity(10);
		lottery1.setComplete_once(true);
		lottery1.setDesc("【太1:1】 亚伯拉罕的后裔，大卫的子孙，耶稣基督的家谱。");

		Lottery lottery2 = new Lottery();
		lottery2.setId(1);
		lottery2.setName("四等奖");
		lottery2.setImage("image4");
		lottery2.setTitleImage("4等奖名称图片");
		lottery2.setMusic(true);
		lottery2.setCapacity(8);
		lottery2.setComplete_once(true);
		lottery2.setDesc("【太1:21】 她将要生一个儿子。你要给他起名叫耶稣。因他要将自己的百姓从罪恶里救出来。");

		Lottery lottery3 = new Lottery();
		lottery3.setId(2);
		lottery3.setName("三等奖等奖");
		lottery3.setImage("image3");
		lottery3.setTitleImage("3等奖名称图片");
		lottery3.setMusic(true);
		lottery3.setCapacity(5);
		lottery3.setComplete_once(true);
		lottery3.setDesc("【太5:3】 虚心的人有福了，因为天国是他们的。");

		Lottery lottery4 = new Lottery();
		lottery4.setId(3);
		lottery4.setName("二等奖等奖");
		lottery4.setImage("image2");
		lottery4.setTitleImage("2等奖名称图片");
		lottery4.setMusic(true);
		lottery4.setCapacity(3);
		lottery4.setComplete_once(false);
		lottery4.setDesc("【太5:18】 我实在告诉你们，就是到天地都废去了，律法的一点一画也不能废去，都要成全。");

		Lottery lottery5 = new Lottery();
		lottery5.setId(4);
		lottery5.setName("一等奖等奖");
		lottery5.setImage("image1");
		lottery5.setTitleImage("1等奖名称图片");
		lottery5.setMusic(true);
		lottery5.setCapacity(1);
		lottery5.setComplete_once(false);
		lottery5.setDesc("【太5:18】 我实在告诉你们，就是到天地都废去了，律法的一点一画也不能废去，都要成全。");

		List<Lottery> lotteryList = new ArrayList<Lottery>();
		lotteryList.add(lottery1);
		lotteryList.add(lottery2);
		lotteryList.add(lottery3);
		lotteryList.add(lottery4);
		lotteryList.add(lottery5);

		System.out.println("奖品:");
		System.out.println(JSONObject.toJSONString(lottery1));
		System.out.println(JSONObject.toJSONString(lotteryList));
		System.out.println("---------------------");
		System.out.println();

		JSONObject region1 = new JSONObject();
		region1.put("start", 1);
		region1.put("end", 100);
		JSONObject region2 = new JSONObject();
		region2.put("start", 150);
		region2.put("end", 300);
		ArrayList<JSONObject> baseCandidates = new ArrayList<JSONObject>();
		baseCandidates.add(region1);
		baseCandidates.add(region2);

		System.out.println("候选名单区间:");
		System.out.println(baseCandidates);
		System.out.println("----------------");
		System.out.println();

		ArrayList<JSONObject> WinnersList = new ArrayList<JSONObject>();
		for (Lottery lottery : lotteryList) {
			JSONObject winners = new JSONObject();
			winners.put("id", lottery.getId());
			winners.put("name", lottery.getName());
			ArrayList<Integer> winnerList = new ArrayList<Integer>();
			for (int i = 0; i < lottery.getCapacity(); i++) {
				winnerList.add(RandomUtils.nextInt(1000));
			}
			winners.put("winners", winnerList);
			WinnersList.add(winners);
		}
		
		System.out.println("中奖名单：");
		System.out.println(WinnersList);
		System.out.println("------------");
		System.out.println();
		
	}

}
