package com.java.practice;


public class thread extends Thread{  
 public void run(){  
  for(int i=1;i<=5;i++){  
   try{  
    Thread.sleep(500);  
   }catch(Exception e){System.out.println(e);}  
  System.out.println(i);  
  }  
 }  
public static void main(String args[]){  
 thread t1=new thread();  
 thread t2=new thread();  
 thread t3=new thread();  
 t1.start();  
 try{  
  t1.join(1500);  
 }catch(Exception e){System.out.println(e);}  
  
 t2.start();  
 t3.start();  
 }  
}  