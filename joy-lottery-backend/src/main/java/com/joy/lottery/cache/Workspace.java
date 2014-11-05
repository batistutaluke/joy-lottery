package com.joy.lottery.cache;

import java.io.Serializable;
import java.util.ArrayList;

import com.alibaba.fastjson.JSONObject;

/**
 * Created by zhangjingbo on 14-10-22.
 */
public class Workspace implements Serializable {

	private ArrayList<Integer> giveupList;
	private JSONObject winningList;
	private int currentLottery;
	private int currentLotteryWinners;

	private static Workspace workspace = new Workspace();

	public static void initWorkspace(String path) {

	}

	public static Workspace getInstance() {
		return workspace;
	}

	public ArrayList<Integer> getGiveupList() {
		return giveupList;
	}

	public void setGiveupList(ArrayList<Integer> giveupList) {
		this.giveupList = giveupList;
	}

	public JSONObject getWinningList() {
		return winningList;
	}

	public void setWinningList(JSONObject winningList) {
		this.winningList = winningList;
	}

	public int getCurrentLottery() {
		return currentLottery;
	}

	public void setCurrentLottery(int currentLottery) {
		this.currentLottery = currentLottery;
	}

	public int getCurrentLotteryWinners() {
		return currentLotteryWinners;
	}

	public void setCurrentLotteryWinners(int currentLotteryWinners) {
		this.currentLotteryWinners = currentLotteryWinners;
	}

}
