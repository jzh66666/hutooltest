package com.tests.dateutiltest;

import cn.hutool.core.date.ChineseDate;
import cn.hutool.core.date.DateUtil;

/**
 * @desc   农历信息类
 * @author JZH
 * @time   2021年2月5日
 */
public class DateChange {
	/**
	 * 获取指定年月日农历信息
	 * @param year
	 * @param month
	 * @param day
	 */
	public static void getNongLiMessage(int year,int month,int day){
		//规范格式
		String monthTemp = "";
		String dayTemp = "";
		if(month<10){
			monthTemp = "0"+month;
		}
		else{
			monthTemp = month+"";
		}
		if(day < 10){
			dayTemp = "0"+day;
		}
		else{
			dayTemp = day+"";
		}
		try {
			//规范格式为“2020-01-02”
			String dateTemp = year+"-"+monthTemp+"-"+dayTemp;
			//通过公历构建
			ChineseDate date = new ChineseDate(DateUtil.parse(dateTemp));
			//农历月份
			System.out.println(date.getChineseMonthName());
			//农历日期
			System.out.println(date.getChineseDay());
			//生肖
			System.out.println(date.getChineseZodiac());
			//节日
			System.out.println(date.getFestivals());
			
			
		} catch (Exception e) {
			//格式错误
			System.out.println("日期有误");
		}
		
	}
}
