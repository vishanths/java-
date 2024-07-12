import java.util.Random;
import java.util.Scanner;

class Square extends Thread {
    int x;

    Square(int n) {
        x = n;
    }

    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr);
    }
}

class Cube extends Thread {
    int x;

    Cube(int n) {
        x = n;
    }

    public void run() {
        int cub = x * x * x;
        System.out.println("Cube of " + x + " = " + cub);
    }
}

class Number extends Thread {
    int x;
    Number(int n)
    {
        x=n;
    }
    public void run() {
        Random random = new Random();
        for (int i = 0; i < x; i++) {
            int randomInteger = random.nextInt(100);

            System.out.println("Random Integer generated : " + randomInteger);

            Square s = new Square(randomInteger);
            s.start();

            Cube c = new Cube(randomInteger);
            c.start();

            try {
                s.join(); // Wait for Square thread to complete
                c.join(); // Wait for Cube thread to complete
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }
    }
}

public class prog5 {
    public static void main(String args[]) {
        Scanner s1=new Scanner(System.in);
        System.out.println("how many times?:");
        int x=s1.nextInt();
        Number n = new Number(x);
        n.start();
        s1.close();
    }
}
