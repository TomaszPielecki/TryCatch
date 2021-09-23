package PieleckiTomasz.pl;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]);
        } catch (Exception e) {
            System.out.println("Something went wrong. array is to [3]");
        } finally {
            System.out.println("Finish try and catch");
        }
// Enter age, later 18 years indicate no access to disco above give access
        System.out.println("Tell me what ur is age?");

        int age;age = getInt();
        try {
            if (age >= 18) {
                System.out.println("u have Access to Disco party");
            } else {
                System.out.println("U don't have access on Disco Party");
            }
        } catch (Exception e) {
            System.out.println("Age not given");
        }finally {
            System.out.println("End of maturity test");
        }
    }
    public static int getInt(){
        return new Scanner(System.in).nextInt();
    }
}














