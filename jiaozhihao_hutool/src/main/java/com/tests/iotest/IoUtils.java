package com.tests.iotest;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;

import cn.hutool.core.io.FileUtil;
import cn.hutool.core.io.IoUtil;
import cn.hutool.core.io.file.FileNameUtil;

/**
 * @desc   hutool  IO工具类小例子工具类
 * @author JZH
 *
 */
public class IoUtils {
	/**
	 * 拷贝文件
	 * @return
	 */
	public static boolean changeFilePath(String inPath,String outPath){
		//获取文件输入流
		BufferedInputStream in = FileUtil.getInputStream(inPath);
		//获取文件输出流
		BufferedOutputStream out = FileUtil.getOutputStream(outPath);
		long copysize = IoUtil.copy(in, out,IoUtil.DEFAULT_BUFFER_SIZE);
		//拷贝大小为0  未成功
		if (copysize == 0) {
			return false;
		}
		return true;
	}
	/**
	 * 判断是否为文件
	 * @param filePath
	 * @return
	 */
	public static boolean isFile(File file){
		//获取文件后缀
		String houZhui = FileNameUtil.extName(file);
		if(houZhui.equals("jpg") || houZhui.equals("jpeg") || houZhui.equals("bmp") || houZhui.equals("gif") || houZhui.equals("png")
				|| houZhui.equals("ai") || houZhui.equals("svg")){
			return false;
		}
		return true;
	}
	
}
