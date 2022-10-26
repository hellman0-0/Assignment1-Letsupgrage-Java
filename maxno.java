import java.util.Scanner;
public class maxno
{
    /**
     * @param args
     */
    public static void main(String args[])
    {
       System.out.println("taking input from user");
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter Number 1");
       int a=sc.nextInt();
       System.out.println("Enter Number 2");
       int b=sc.nextInt();
       System.out.println("Enter Number 3");
       int c=sc.nextInt();
       int m=a;
       if(b>m)
       m=b;
       if(c>m)
       m=c;
       System.out.println("Maximum No is");
       System.out.println(m);
        sc.close();
       return; 
    }
}
