package io.github.xulingjue.network;

import java.net.InetAddress;
import java.net.URLEncoder;

public class InetAddressTest {

	public static void main(String[] agrs) throws Exception {
		InetAddress ip = InetAddress.getByName("www.vip.com");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.isReachable(2000));

		String urlStr = URLEncoder.encode("哈哈", "utf-8");
		System.out.println(urlStr);
	}
}
