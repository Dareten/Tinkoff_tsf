import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите номер задачи: ");
        switch (scan.nextInt()){
            case 1:
                System.out.print(Problem_one.resolution());
                break;
        }
    }
}
