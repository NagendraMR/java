import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char op;
        double n1, n2, res;
        System.out.println("Enter Two Number: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        System.out.println("Enter an Operator: ");
        op = sc.next().charAt(0);
        switch(op)
        {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case  '/':
                res = n1 /n2;
                break;
            default:
                System.out.println("Invalid operator,Enter correct operator");
                return;

        }
        System.out.println(" "+n1+" "+op+" "+n2+" = "+res+" ");
    }
}
