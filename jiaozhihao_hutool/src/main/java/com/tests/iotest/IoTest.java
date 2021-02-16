package com.tests.iotest;

import java.io.File;
import java.io.FileInputStream;

import cn.hutool.core.io.FileUtil;

/**
 * @desc   io小例子_文件分类
 * @author JZH
 *
 */
public class IoTest {
	public static void main(String[] args) {
		//创建文件夹
		File img = FileUtil.file("/file/img");
		img.mkdir();
		System.out.println(img.exists());
		File file = new File("/file/file");
		file.mkdir();
	}
}
