package com.joy.lottery.cache;

import java.util.ArrayList;

import com.joy.lottery.model.Lottery;
import com.joy.lottery.util.StringUtil;

/**
 * Created by zhangjingbo on 14-10-22.
 */
public class BaseData {

	private static String baseDataPath = "";
	private static String workspacePath = "";
	private static ArrayList<Integer> candidates;
	private static ArrayList<Lottery> lottories;
	private static String backgroud;

	public static String getBackgroud() {
		return backgroud;
	}

	public static void setBackgroud(String backgroud) {
		BaseData.backgroud = backgroud;
	}

	public static ArrayList<Integer> getCandidates() {
		return candidates;
	}

	public static void setCandidates(ArrayList<Integer> candidates) {
		BaseData.candidates = candidates;
	}

	public static ArrayList<Lottery> getLottories() {
		return lottories;
	}

	public static void setLottories(ArrayList<Lottery> lottories) {
		BaseData.lottories = lottories;
	}

	public static String getBaseDataPath() {
		return baseDataPath;
	}

	public static void setBaseDataPath(String baseDataPath) {
		BaseData.baseDataPath = StringUtil.getFormatPath(baseDataPath);
	}

	public static String getWorkspacePath() {
		return workspacePath;
	}

	public static void setWorkspacePath(String workspacePath) {
		BaseData.workspacePath = StringUtil.getFormatPath(workspacePath);
	}
}
