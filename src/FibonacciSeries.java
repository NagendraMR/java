import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int num1 =0, num2=1, n, i =0;
        System.out.println("Enter the number of elements in the sequence");
        Scanner sc = new Scanner (System.in);
        n = sc.nextInt();
        System.out.println("Fibonacci Series of "+n+" numbers are ");
        while(i<=n){
            System.out.println(num1+" ");
            int SumOfPreviesTwoNum = num1+num2;
            num1 =num2;
            num2 = SumOfPreviesTwoNum;
            i++;
        }
    }
}
