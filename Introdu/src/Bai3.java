import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args) {
        int number;
        int result;
        do {
            System.out.println("You enter money number want to change USD to VND");
            Scanner scanner = new Scanner(System.in);
             number = Integer.parseInt(scanner.nextLine());
        }while(number<0);
        result = number*23000;
        System.out.println("Usd to VND : " + result);


    }
}
