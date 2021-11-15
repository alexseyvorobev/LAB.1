import java.util.InputMismatchException;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int num = 0;
        try {
            Scanner console = new Scanner(System.in);
            System.out.println("Введите первое число");
            a = console.nextInt();
            System.out.println("Введите второе число");
            b = console.nextInt();
            System.out.println("Введите третье число");
            c = console.nextInt();
            System.out.println("Введите четвёртое число");
            d = console.nextInt();
            console.close();
        }
        catch (InputMismatchException e) {
            System.out.println("Error");
        }
        if ((a<=b) & (a<=c) & (a<=d)) {
            num = a;
        }
        if ((b <= a) & (b <= c) & (b <= d)) {
            num = b;
        }
        if ((c <= a) & (c <= b) & (c <= d)) {
            num = c;
        }
        if ((d <= a) & (d <= b) & (d <= c)) {
            num = d;
        }
        System.out.print("Наименьшее значение:");
        System.out.println(num);
    }
}