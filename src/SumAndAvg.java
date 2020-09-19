import java.util.Scanner;
public class SumAndAvg {
    public static void main(String[] args)
    {
        int n, sum=0;
        float avg;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements in the array : ");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter the elements of the array :");
        for(int i =0;i<n;i++)
        {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum of the elements : "+sum);
        avg =(float)sum /n;
        System.out.println("Average of the elements : "+avg);

    }
}
