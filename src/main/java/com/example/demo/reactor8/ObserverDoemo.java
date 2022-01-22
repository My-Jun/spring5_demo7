package com.example.demo.reactor8;

import java.util.Observable;

public class ObserverDoemo extends Observable {

	public static void main(String[] args) {
		
		
		ObserverDoemo observer = new ObserverDoemo();
		// 添加观察者
		observer.addObserver((o, str) -> {
			System.out.println("发生变化");
		});
		observer.addObserver((o, str) -> {
			System.out.println("手动被观察者通知，准备改变");
		});
		// 添加监听，知道数据变化
		observer.setChanged();
		// 添加通知
		observer.notifyObservers();

	}

}
