import java.util.Scanner;
//Write a program to find the sum and average of given n numbers.
public class sum_avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Limit: ");
        int n=in.nextInt();
        int sum=0,a;
        for(int i=1;i<=n;i++)
        {
            System.out.println("Enter The Number "+i+": ");
            a=in.nextInt();
            sum+=a;//sum=sum+a;
        }
        System.out.println("The sum of given numbers is : "+sum);
        System.out.println("The Average of given numbers is : "+sum/n);
        in.close();
    }
}