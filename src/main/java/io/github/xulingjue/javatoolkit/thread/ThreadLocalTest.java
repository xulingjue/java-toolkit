package io.github.xulingjue.javatoolkit.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ThreadLocalTest {
	public static class Num{
		int num = 0;
	}
	
	private static ThreadLocal<Num> numHolder = new ThreadLocal<Num>() {
		@Override
		protected Num initialValue() {
			return new Num();
		}
	};
	
	public static Num getNum() {
		return numHolder.get();
	}
	
	public static void setNum(Num num){
		numHolder.set(num);
	}
	
	
	public static void main(String [] agrs){
		Runnable r1 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					
					Num num = ThreadLocalTest.getNum();
					num.num++;
					
					System.out.println("r1 num is :"+num.num);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		
		Runnable r2 = new Runnable() {
			public void run() {
				for (int i = 0; i < 10; i++) {
					
					Num num = ThreadLocalTest.getNum();
					System.out.println("r2 num is :"+num.num);
					
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		

		ExecutorService exec = Executors.newFixedThreadPool(5);
		exec.submit(r1);
		exec.submit(r2);
		exec.shutdown();
	
	}
}
