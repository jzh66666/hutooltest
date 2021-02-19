package com.tests.iotest;

import java.io.File;
import java.io.IOException;

public class IoTest {
	public static void main(String[] args) throws IOException {
		//获取项目路径
		IoTest ioTest = new IoTest();
		String path = ioTest.luJing();
		System.out.println(path);
		//创建文件夹
		File img = new File(path+"/file/img");
		if(!img.exists()){
			img.mkdir();
		}
		File file = new File(path+"/file/file");
		if(!file.exists()){
			file.mkdir();
		}
		File file2 = new File(path+"/file");
		//获取该路径下文件
		String[] fileList = file2.list();
		for (String string : fileList) {
			File temp = new File(path+"/file/"+string);
			//非文件夹
			if(!temp.isDirectory()){
				//如果是文件
				if(IoUtils.isFile(temp)){
					//拷贝到file文件夹
					IoUtils.changeFilePath(path+"/file/"+string, path+"/file/file/"+string);
				}
				else {
					//拷贝到img文件夹
					IoUtils.changeFilePath(path+"/file/"+string, path+"/file/img/"+string);
				}
			}
			
		}
	}
	/**
	 * 获取项目路径
	 * @return
	 */
	public String luJing(){
		 File f = new File(this.getClass().getResource("/").getPath()); 
		 return f.toString();
	}
}
