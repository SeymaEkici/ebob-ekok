import java.util.*;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int ebob = 1;

        for (int i = num1 ; i >= 1 ; i--){
            if(((num1 % i) == 0) && ((num2 % i) == 0)){
                ebob = i;
                System.out.println("Ebob: " + ebob);
                break;
            }
        }

        System.out.println("Ekok: " + (num1 * num2) / ebob);
    }
}
