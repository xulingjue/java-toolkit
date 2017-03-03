package io.github.xulingjue.jsouptest;

/**
 * jsoup 进行html解析
 */

import junit.framework.Assert;
import junit.framework.TestCase;

import org.jsoup.Jsoup;
import org.jsoup.safety.Whitelist;

public class JsoupTest {

	public static String clean(String key) {
		String unsafe = key;
		String safe = Jsoup.clean(unsafe, Whitelist.basicWithImages());
		System.out.println(safe);
		return safe;
	}

	public static class Test extends TestCase {
		private JsoupTest jt ;
		
		protected void setUp() {
			jt = new JsoupTest();
		}

		protected void tearDown() {
			jt = null;
		}

		private void t(String input, String result) {
			Assert.assertEquals(result, jt.clean(input));
		}

		public void test_basics() {
			t("dd", "dd");
		}

		public void test_basics2() {
			t("dc", "ddc");
		}
		
		public void test_basics3() {
			t("dd3", "dd3");
		}
		
	}
}
