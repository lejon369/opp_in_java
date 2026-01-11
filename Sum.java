import java.util.Scanner;

public class Sum {
    public static void main(String[] args){
        Scanner ne = new Scanner(System.in);
        System.out.println("Enter a number:");
        int a = ne.nextInt();
        int b = ne.nextInt();

        int sum = a+b;
        System.out.println(sum);
    }
}
