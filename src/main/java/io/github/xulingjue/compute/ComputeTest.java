package io.github.xulingjue.compute;

import java.math.BigDecimal;

public class ComputeTest {


		public static void main(String[] args) {
			
			//除法总是取整数部分
			System.out.println(3/2);//1
			
			//float 加法失去精度
			float float_a = 0.05f;
			float float_b = 0.01f;
			System.out.println(float_a+float_b);//0.060000002
			
			//double 加法
			double double_a = 0.05d;
			double double_b = 0.01d;
			System.out.println(double_a+double_b);//0.060000000000000005		
			
			BigDecimal bigDecimal_a1 = new BigDecimal(float_a+"");
			BigDecimal bigDecimal_b1 = new BigDecimal(float_b+"");
			System.out.println(bigDecimal_a1.add(bigDecimal_b1));//0.06
			
			BigDecimal bigDecimal_a2 = new BigDecimal(double_a+"");
			BigDecimal bigDecimal_b2 = new BigDecimal(double_b+"");
			System.out.println(bigDecimal_a2.add(bigDecimal_b2));//0.06	
			System.out.println(bigDecimal_a2.floatValue());
			
			int j = 0;
			for (int i = 0; i < 100; i++) {
				j = j++;
			}
			System.out.println(j);

			int i = 012;
			System.out.println(i);

			int a = 1;
			System.out.println("value is: " + ((a < 5) ? 10.9 : 9));

			System.out.println(a >> 32);

			/*
			URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
			for (int i = 0; i < urls.length; i++) {
				System.out.println(urls.toExternalform());
			}
			*/
			int ii = 2;
			int jj = 2;
			;
			System.out.println(Math.ceil(1));
			
			
			int aa = 2147483647;
			System.out.println(aa);
		}
	
}
