import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        double total =0;

        do{
            System.out.print("Bir sayı giriniz :");
            n = input.nextInt();
            if(n%4 ==0) {
                total += n;
            }

        }while (n%2 != 1);

        System.out.print("Total :"+ total);
    }
}