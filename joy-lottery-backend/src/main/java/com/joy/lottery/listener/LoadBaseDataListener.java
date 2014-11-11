package com.joy.lottery.listener;

import java.io.File;
import java.util.ArrayList;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.springframework.context.ApplicationContext;

import com.joy.lottery.cache.BaseData;
import com.joy.lottery.cache.Workspace;
import com.joy.lottery.dao.TestDao;
import com.joy.lottery.model.Image;
import com.joy.lottery.model.Lottery;
import com.joy.lottery.service.TestService;
import com.joy.lottery.util.ApplicationContextUtil;
import com.joy.lottery.util.LotteryUtil;
import com.joy.lottery.util.StringUtil;

public class LoadBaseDataListener implements ServletContextListener {

	public void contextInitialized(ServletContextEvent event) {
		/*
		 * TODO 加载基础数据
		 */
		BaseData.setBaseDataPath(LotteryUtil.getProperties("basedata.path"));
		BaseData.setWorkspacePath(LotteryUtil.getProperties("workspace.path"));

		// TODO 加载资源图片

		ArrayList<String> lotteryNames = LotteryUtil
				.parseStringArray(LotteryUtil.getProperties("lottery.names"));
		ArrayList<Integer> lotteryNumbers = LotteryUtil
				.parseIntArray(LotteryUtil.getProperties("lottery.numbers"));
		ArrayList<Integer> lotteryRules = LotteryUtil.parseIntArray(LotteryUtil
				.getProperties("lottery.once"));
		ArrayList<String> lotteryDescs = LotteryUtil
				.parseStringArray(LotteryUtil.getProperties("lottery.descs"));
		ArrayList<String> lotteryImages = LotteryUtil
				.parseStringArray(LotteryUtil.getProperties("lottery.images"));

		ArrayList<Lottery> lotteries = new ArrayList<>();

		// 设置奖项
		for (int i = 0; i < lotteryNames.size(); i++) {
			Lottery lottery = new Lottery();
			lottery.setId(i);
			lottery.setName(lotteryNames.get(i));
			lottery.setCapacity(lotteryNumbers.get(i));
			lottery.setComplete_once(true);
			lottery.setDesc(lotteryDescs.get(i));
			String imagePath = StringUtil.getFormatPath(BaseData
					.getBaseDataPath())
					+ "images"
					+ File.separator
					+ lotteryImages.get(i);
			Image image = new Image(i, lotteryImages.get(i), imagePath);
			lottery.setImage("");
			lotteries.add(lottery);
		}

		BaseData.setLottories(lotteries);

		// 初始化候选人
		ArrayList<Integer> candidates = LotteryUtil.parseIntArray(LotteryUtil
				.getProperties("candidates"));
		BaseData.setCandidates(candidates);

		// TODO 初始化工作空间
		Workspace.initWorkspace(BaseData.getWorkspacePath());

		System.out.println(BaseData.getBaseDataPath());
		System.out.println(BaseData.getWorkspacePath());

		ApplicationContext applicationContext = ApplicationContextUtil
				.getApplicationContext(event.getServletContext());
		TestService testService = (TestService) applicationContext
				.getBean("testService");
		System.out.println("contextInitialized:" + testService.test());
	}

	public void contextDestroyed(ServletContextEvent event) {
		/*
		 * TODO 把抽奖进度保存到工作空间
		 */
		ApplicationContext applicationContext = ApplicationContextUtil
				.getApplicationContext(event.getServletContext());
		TestDao testDao = (TestDao) applicationContext.getBean("testDao");
		System.out.println("contextDestroyed:" + testDao.test());
	}

}
