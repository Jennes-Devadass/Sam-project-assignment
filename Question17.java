import java.util.*;
class Question17
{
    void transpose()
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int t[][]=new int[3][3];
        System.out.println("ENTER ELEMENTS OF ARRAY");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            a[i][j]=sc.nextInt();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                t[j][i]=a[i][j];
            }
        }
        System.out.println("ORIGINAL ARRAY");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
              System.out.print(a[i][j]+" ");
            System.out.println();
        }
        System.out.println("NEW ARRAY");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
              System.out.print(t[i][j]+" ");
            System.out.println();
        }
    }
}
               
        