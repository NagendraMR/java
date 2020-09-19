import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {

        int n, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to find factorial of it : ");
        n = sc.nextInt();
        for(int i=1;i<n;i++){
            fact *= i;
        }
        System.out.println("The factorial of the entered number "+n+" is "+fact);
    }

}
