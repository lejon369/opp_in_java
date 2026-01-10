
import java.util.*;

public class if_else {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();

        if (age >= 18){
            System.out.println("Yes... you are adult !!!!");
        }else {
            System.out.println("no.... you are not adult");
        }
    }
}
