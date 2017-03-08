package io.github.xulingjue.javatoolkit.thread;

public class ThreadTest implements Runnable {
	private String tag = "";
	private Account account;
	private int draw;

	public ThreadTest(String tag, Account account, int money) {
		this.tag = tag;
		this.account = account;
		this.draw = money;
	}

	@Override
	public void run() {
		//
		synchronized (account) {
			if (account.money >= this.draw) {

			} else {
				System.out.println(this.tag + ":" + "end_money" + ":"
						+ account.money);
				return;
			}

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			account.draw(this.draw);

			System.out.println(this.tag + ":" + "end_money" + ":"
					+ account.money);
		}

	}

	public static void main(String[] agrs) {
		Account account = new Account();

		ThreadTest tt1 = new ThreadTest("thread 1", account, 900);
		// ThreadTest tt2 = new ThreadTest("thread 2",account,9);

		for (int i = 0; i < 10; i++) {
			new Thread(tt1).start();
		}
	}

}
