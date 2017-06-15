package cn.campsg.practical.bubble.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import cn.campsg.practical.bubble.entity.Score;

public class Configuration {
	public final static String FILE_NAME = "score.conf";

	Score score = null;
	
	public Configuration() {
		score = new Score();
		//获取配置文件的路径
		InputStream scoreFile = getClass().getClassLoader().getResourceAsStream(FILE_NAME);
		//将InputStream对象转换成BufferedReader对象，然后读取配置文件
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(scoreFile));
		
		//文件读取的异常捕获 (略写。。。)
		try{
			score.setLevelScore(Integer.parseInt(bufferedReader.readLine()));
			score.setStep(Integer.parseInt(bufferedReader.readLine()));
			score.setIncrement(Integer.parseInt(bufferedReader.readLine()));
			score.setLength(Integer.parseInt(bufferedReader.readLine()));
			//关闭文件缓存读取器
			bufferedReader.close();
			
		}catch (FileNotFoundException e) {
			score = null;
			System.out.println("未找到文件");
		}catch (IOException e) {
			score = null;
			System.out.println("文件读取失败");
		}
		
	}
	
	public Score getScore(){
		return score;
	}
}
