package loops;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        System.out.println("Enter the power for "+ number+": ");
        int n = sc.nextInt();
        long result = 1;

        for(int i = 0;i<n;i++){
            result*=number;
        }
        System.out.println("The result is: "+result);

    }
}
