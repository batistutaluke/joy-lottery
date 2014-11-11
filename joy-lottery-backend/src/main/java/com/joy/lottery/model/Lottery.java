package com.joy.lottery.model;


/**
 * 
 * @author luke
 * 
 */
public class Lottery {

	private String name;
	private int id;
	private String image;
	private String titleImage;
	private boolean isMusic;
	/**
	 * true:一次抽完, false:一次抽一个
	 */
	private boolean complete_once;
	private String desc;
	private int capacity;

	public int getCapacity() {
		return capacity;
	}

	public String getTitleImage() {
		return titleImage;
	}

	public void setTitleImage(String titleImage) {
		this.titleImage = titleImage;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
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

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public boolean isMusic() {
		return isMusic;
	}

	public void setMusic(boolean isMusic) {
		this.isMusic = isMusic;
	}

	/**
	 * @return the complete_once
	 */
	public boolean isComplete_once() {
		return complete_once;
	}

	/**
	 * @param complete_once
	 *            the complete_once to set
	 */
	public void setComplete_once(boolean complete_once) {
		this.complete_once = complete_once;
	}

}
