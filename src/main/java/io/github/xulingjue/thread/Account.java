package io.github.xulingjue.thread;

public class Account {
	public int money = 1000;
	
	public int draw(int money){
		this.money = this.money - money;
		return this.money;
	}
}
