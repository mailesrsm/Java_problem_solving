package com.Multithread;

public class Multi extends Thread{	
		public void run() {
			for(int i=0;i<=5;i++) {
				System.out.println(Thread.currentThread().getName()+" "+i);
				try {
					sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		}
		public static void main(String[] args) {
			Multi t=new Multi();
			Multi t1=new Multi();
			t.start();
			t1.start();
		}

	}


