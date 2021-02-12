package com.bd.test;

import java.util.Calendar;
import java.util.Date;

import cn.hutool.core.date.DateUtil;

/**
 * @desc   测试hutool日期类
 * @author JZH
 * @time   2021年2月5日23:52:16
 */
public class test01 {
	/**
	 * 测试hutool日期工具main函数
	 * @param args
	 */
	public static void main(String[] args) {
		//当前时间
		Date date = DateUtil.date();
		System.out.println("当前时间："+date);
		//当前时间
		Date date2 = DateUtil.date(Calendar.getInstance());
		System.out.println("当前时间："+date2);
		//当前时间
		Date date3 = DateUtil.date(System.currentTimeMillis());
		System.out.println("当前时间："+date3);
		//当前时间字符串，格式：yyyy-MM-dd HH:mm:ss
		String now = DateUtil.now();
		System.out.println("当前时间字符串："+now);
		//当前日期字符串，格式：yyyy-MM-dd
		String today= DateUtil.today();
		System.out.println("当前日期字符串:"+today);
		
		//字符串转日期
		String datestr="2021-02-05";
		Date dateToStr = DateUtil.parse(datestr);
		System.out.println(dateToStr);
		//自定义转换格式
		Date dateToStr02 = DateUtil.parse(datestr,"yyyy-MM-dd");
		System.out.println(dateToStr02);
		
	}
}
