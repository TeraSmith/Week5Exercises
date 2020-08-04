import java.util.Scanner;


public class DivisorCalc {

public static void  main(String [] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Number 1:");
    int num1 = input.nextInt();
    System.out.println("Number 2:");
    int num2 = input.nextInt();

    System.out.println("The GCD of " + num1 + " and " + num2 + " is " +  gcd(num1,num2));
}


public static int gcd(int num1, int num2)
{
    int gcd = 1;

    if(num1>num2)
    {
        for(int i = num2; i >=1; i--)
        {
            if(num1%i==0 && num2%i ==0)
            {
                return i;
            }
        }
    }
    else
    {
        for(int j = num1; j >=1; j--)
        {
            if(num1%j==0 && num2% j==0)
            {
                return j;
            }
        }
    }   
    return gcd;

}
}
