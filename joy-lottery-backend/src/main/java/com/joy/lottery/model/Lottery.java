package com.joy.lottery.model;

import java.util.ArrayList;

/**
 * 
 * @author luke
 * 
 */
public class Lottery {

	private String name;
	private int id;
	private ArrayList<String> winningList;
	private Image image;
	private boolean haveMusic;
	/**
	 * 0.一次抽完, 1.一次抽一个
	 */
	private int rule;
	private String desc;
	private int numbers;

	public int getNumbers() {
		return numbers;
	}

	public void setNumbers(int numbers) {
		this.numbers = numbers;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public int getRule() {
		return rule;
	}

	public void setRule(int rule) {
		this.rule = rule;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ArrayList<String> getWinningList() {
		return winningList;
	}

	public void setWinningList(ArrayList<String> winningList) {
		this.winningList = winningList;
	}

	public Image getImage() {
		return image;
	}

	public void setImage(Image image) {
		this.image = image;
	}

	/**
	 * @return the haveMusic
	 */
	public boolean isHaveMusic() {
		return haveMusic;
	}

	/**
	 * @param haveMusic the haveMusic to set
	 */
	public void setHaveMusic(boolean haveMusic) {
		this.haveMusic = haveMusic;
	}


}
