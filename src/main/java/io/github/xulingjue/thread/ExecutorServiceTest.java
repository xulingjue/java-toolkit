package io.github.xulingjue.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceTest {
	public static void main(String [] agrs){
		ExecutorService executorService = Executors.newCachedThreadPool();
		
		//获取cpu数目
		int cpuNums = Runtime.getRuntime().availableProcessors();
		
		System.out.println(cpuNums);
	}
}
