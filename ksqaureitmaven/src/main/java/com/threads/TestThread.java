package com.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestThread{
	
	public static void main(String[] args) {
		boolean flag=false;
		List<Customer> al = new ArrayList<Customer>();
	
		for(int i=0;i<100;i++){
			Customer c = new Customer(i,1000,"Customer"+i);
			al.add(c);
		}
		
		while(true){
			if(flag==true){
				System.exit(0);
			}
			
			Scanner sc = new Scanner(System.in);
			System.out.println("\n1.Transaction with Synchronized Threading \n2.Transaction without Threading"
					+ "\n3.Transaction with Threading only");
			int i=sc.nextInt();
			
			switch(i){
			case 1:
				System.out.println("Time before Synchronized threading="+ System.currentTimeMillis() +"ms"
						+ "\nPlease wait..");
				
				
				for(Customer c:al){
					ExecuteTransaction e = new ExecuteTransaction();
					e.setCustomer(c,100);
					e.start();//Threading
					try {
						e.join();
					} catch (InterruptedException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				System.out.println("Time after Synchronized threading="+ System.currentTimeMillis() +"ms");
				break;
				
			case 2:
				System.out.println("Time before without threading="+ System.currentTimeMillis() +"ms"
						+ "\nPlease wait..");
				for(Customer c:al){
					ExecuteTransaction e = new ExecuteTransaction();
					e.setCustomer(c,100);
					e.processPayment(c, 100);		//Without Threading
				}
				System.out.println("Time after without threading="+ System.currentTimeMillis() +"ms");
				break;
	
			case 3:
				System.out.println("Time before unsynchronized threading="+ System.currentTimeMillis() +"ms");
				ExecutorService paymentService = Executors.newCachedThreadPool();
				ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);
				for(Customer c:al){
					
					
					ProcessTransaction p = new ProcessTransaction();
					p.setCustomer(c,100);
					
					//p.start();//Threading
					//paymentService.submit(p);
					fixedThreadPool.submit(p);
				}
				
				System.out.println("Time after unsynchronized threading="+ System.currentTimeMillis() +"ms");
				break;
			default:
				System.out.println("Wrong input,transaction terminate");
				flag=true;
				break;
			}
		}
	}
}