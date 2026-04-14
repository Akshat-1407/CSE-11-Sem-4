// class EvenThread implements Runnable {
//     public void run() {
//         for (int i = 2; i <= 10; i += 2) {
//             try {
//                 System.out.println("Even Thread: " + i);
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class OddThread implements Runnable {
//     public void run() {
//         for (int i = 1; i <= 10; i += 2) {
//             try {
//                 System.out.println("Odd Thread: " + i);
//                 Thread.sleep(1000); 
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// public class Thread {
//     public static void main(String[] args) {

//         Thread t1 = new Thread(new EvenThread());
//         Thread t2 = new Thread(new OddThread());


//         // Runnable even = new EvenThread();
//         // Runnable odd = new OddThread();
//         // Thread t1 = new Thread(even);
//         // Thread t2 = new Thread(odd);


//         // EvenThread even = new EvenThread();
//         // OddThread odd = new OddThread();
//         // Thread t1 = new Thread(even);
//         // Thread t2 = new Thread(odd);

//         t2.start();
//         t1.start();
//     }
// }

// -------------------------------------------------------------------------------

// class EvenThread extends Thread {
//     public void run() {
//         for (int i = 2; i <= 10; i += 2) {
//             try {
//                 System.out.println("Even Thread: " + i);
//                 Thread.sleep(2000);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }

// class OddThread extends Thread {
//     public void run() {
//         for (int i = 1; i <= 10; i += 2) {
//             try {
//                 System.out.println("Odd Thread: " + i);
//                 Thread.sleep(1000);
//             } catch (InterruptedException e) {
//                 System.out.println(e);
//             }
//         }
//     }
// }



// public class test {
//     public static void main(String[] args)  {
//         Thread even = new EvenThread();
//         Thread odd = new OddThread();

//         odd.start();
//         even.start();
//     }
// }
