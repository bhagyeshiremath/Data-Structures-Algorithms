import java.util.Scanner;
public class timeComplexityDemo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the value :- ");
        int sum = scn.nextInt();
        double now = System.currentTimeMillis();

        timeComplexityDemo t = new timeComplexityDemo();
        System.out.println(t.findsum(sum));
        System.out.println("The taken " +(System.currentTimeMillis()- now) + " miliseconds");
        scn.close();
    }

    public int findsum(int n)
    {
        return n * (n + 1)/2;
    }

    // public int findsum(int n)
    // {
    //     int sum = 0;
    //     for(int i =0 ; i <= n ; i++)
    //     {
    //         sum = sum + i;
    //     }
    //     return sum;
    // }
}