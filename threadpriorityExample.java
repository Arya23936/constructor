class MyThread extends Thread {
     @Override
     public void run() {
         System.out.println(Thread.currentThread().getName() + " has priority: " + Thread.currentThread().getPriority());
         for (int i = 0; i < 5; i++) {
             System.out.println(Thread.currentThread().getName() + " is running: " + i);
             try {
                 Thread.sleep(500); // 
             } catch (InterruptedException e) {
                 System.out.println(e);
             }
         }
     }
 }
 
 public class ThreadPriorityExample {
     public static void main(String[] args) {
         // Creating threads
         MyThread thread1 = new MyThread();
         MyThread thread2 = new MyThread();
         MyThread thread3 = new MyThread();
 
         thread1.setPriority(Thread.MIN_PRIORITY);  // Minimum priority (1)
         thread2.setPriority(Thread.NORM_PRIORITY); // Default priority (5)
         thread3.setPriority(Thread.MAX_PRIORITY);  // Maximum priority (10)
 
         System.out.println(thread1.getName() + " priority: " + thread1.getPriority());
         System.out.println(thread2.getName() + " priority: " + thread2.getPriority());
         System.out.println(thread3.getName() + " priority: " + thread3.getPriority());
 
         thread1.start();
         thread2.start();
         thread3.start();
     }
