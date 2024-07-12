import java.util.Scanner;

class EvenThread extends Thread {
    private int[] arr;

    public EvenThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Answer even: " + sum);
        System.out.println();
    }
}

class OddThread extends Thread {
    private int[] arr;

    public OddThread(int[] arr) {
        this.arr = arr;
    }

    public void run() {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
            }
        }
        System.out.println("Answer odd: " + sum);
        System.out.println();
    }
}

public class thr_ext {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
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

        EvenThread evenThread = new EvenThread(arr);
        OddThread oddThread = new OddThread(arr);

        evenThread.start();
        oddThread.start();
    }
}
