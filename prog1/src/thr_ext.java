
    

import java.util.Scanner;

    public class thr_ext
    {
        public static void main(String[] args) 
        {
            try (Scanner ip = new Scanner(System.in)) {
                System.out.print("Enter number of inputs: ");
                int n = ip.nextInt();

                int[] arr = new int[n];
                System.out.println("Enter input:");

                for (int i = 0; i < n; i++) {
                    arr[i] = ip.nextInt();
                }

                System.out.print("Entered input: ");
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println(); 


                Even run1 = new Even(arr);
Odd run2 = new Odd(arr);

Thread thread1 = new Thread(run1);
Thread thread2 = new Thread(run2);

thread1.start();
thread2.start();
            }

        }
    }

    class Even extends Thread{
        private int[] arr;

        public Even(int[] arr) 
        {
            this.arr = arr;
        }

        public void run() 
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] % 2 == 0) 
                {
                    sum += arr[i];
                }
            }
            System.out.println("answer even : " + sum);
            System.out.println(); 
        }
    }

    class Odd extends Thread
    {
        private int[] arr;

        public Odd(int[] arr) 
        {
            this.arr = arr;
        }

        public void run() 
        {
            int sum = 0;
            for (int i = 0; i < arr.length; i++) 
            {
                if (arr[i] % 2 != 0) 
                {
                    sum += arr[i];
                }
            }
            System.out.println("answer odd : " + sum);
            System.out.println();
        }
    }