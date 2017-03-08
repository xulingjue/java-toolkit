package io.github.xulingjue.javatoolkit.thread;

public class Account {
	public int money = 1000;
	
	public int draw(int money){
		this.money = this.money - money;
		return this.money;
	}
}
