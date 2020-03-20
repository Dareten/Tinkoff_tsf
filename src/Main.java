import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        long start;
        switch (scan.nextInt()){
            case 1:
                start = System.nanoTime();
                System.out.print(Problem_one.resolution());
                System.out.println((double)(System.nanoTime() - start)/1000000000);
                break;
            case 2:
                start = System.nanoTime();
                System.out.print(Problem_two.resolution());
                System.out.println((double)(System.nanoTime() - start)/1000000000);
                break;
            case 3:
                start = System.nanoTime();
                System.out.print(Problem_three.resolution());
                System.out.println((double)(System.nanoTime() - start)/1000000000);
                break;
            case 11:
                long x = scan.nextLong();
                start = System.nanoTime();
                System.out.println(Spring_one.resolution(x));
                System.out.println((double)(System.nanoTime() - start)/1000000000);
                break;
        }
    }
}
