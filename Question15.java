import java.util.*;
class Question15
{
    void insertion()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("ENTER SIZE OF ARRAY");
       int n=sc.nextInt();
       int a[]=new int[n+1];
       System.out.println("ENTER THE ELEMENTS OF THE ARRAY");
       for(int i=0;i<n;i++)
          a[i]=sc.nextInt();
       System.out.println("ENTER ELEMENT TO BE INSERTED");
       int el=sc.nextInt();
       System.out.println("ENTER THE POSITION AT WHICH THE ELEMENT IS TO BE INSERTED");
       int pos=sc.nextInt();
       for(int i=(n-1);i>=(pos-1);i--)
          a[i+1]=a[i];
       a[pos-1]=el; 
       System.out.println("NEW ARRAY");
       for(int i=0;i<(n+1);i++)
          System.out.print(a[i]+" ");
    }
}
       
        
        