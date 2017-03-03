package io.github.xulingjue.memery;

import java.util.HashMap;
import java.util.Map;

public class OutofMemery {
	private Map leafMap = new HashMap();
	
	public void test(){
		int i =0 ;
		while(true){
			System.out.println("_____________"+i+"____________");
			leafMap.put(String.valueOf(i++), new byte[1024*1024]);
			
			//if(leafMap.size()%10 == 0)
				//leafMap.clear();
			
			try{
				Thread.sleep(100);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String [] agrs){
		new OutofMemery().test();
		while(true){}
	}
}
