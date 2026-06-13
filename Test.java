package com.Multithread;

class TableThread extends Thread {
    int num;
    TableThread(int num) {
        this.num = num;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
class TableThread2 extends Thread {
    int num;
    TableThread2(int num) {
        this.num = num;
    }
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
public class Test {
    public static void main(String[] args) {
        TableThread t1 = new TableThread(2);
        TableThread2 t2 = new TableThread2(4);
        t1.start();
        t2.start();
    }
}