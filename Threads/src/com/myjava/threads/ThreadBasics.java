package com.myjava.threads;

//extends Thread

//implements Runnable

//first technique to create thread
class Task1 extends Thread{
	
	public void run() {
		System.out.print("\nTask 1  Started ");
		//Task 1
		for(int i=1;i<=199;i++) {
			System.out.print(i+" ");
			
			}
		System.out.print("\nTask 1 is done ");
		
		
	}
	
}


//second way of creating thread

class Task2 implements Runnable{

	@Override
	public void run() {
		
			System.out.print("\nTask 2 started ");
		for(int i=200;i<=300;i++) {
			System.out.print(i+" ");
			
			}
		System.out.print("\nTask 2 is done ");
	}
	
}


public class ThreadBasics {

	
	
	public static void main(String[] args) {
		
		
		System.out.print("\nTask 1 kicked off ");
		
		Task1 task1 = new Task1();
		task1.start();
		
		
		//Task 2
		System.out.print("\nTask 2 kicked off ");
		
		
		Task2 task2=new Task2();
		Thread task2Thread = new Thread(task2);
		task2Thread.start();
		
		
		//Task3
		for(int i=301;i<=400;i++) {
			System.out.print(i+" ");
			
			}
		System.out.print("\nTask 3 is done ");
	}

}
