import java.util.*;
public class Solution
{
    public static void main(String args[])
    {
        double temp;
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a=in.nextInt();
            int b=in.nextInt();
            int n=in.nextInt();
            temp=0.0;
            for(int j=0;j<n;j++)
            {
                temp=temp+(Math.pow(2,j)*b);
                System.out.printf(a+(int)temp+" ");
            }
                 System.out.println();
        }
    }
}
