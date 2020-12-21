/*This program displays the following pattern
 * 55555
   45555
   34555
   23455
   12345
 */
class Question7
{
    void pattern()
    {
        int i=0,j=0,k=0;//VARIABLES TO BE USED
        for(i=5;i>=1;i--)//OUTER LOOP
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(j);//TO PRINT NUMBERS
            }
            for(k=(i-1);k>=1;k--)
            {
                System.out.print("5");//TO PRINT 5 i TIMES TOTAL IN THE PATTERN
            }
            System.out.println();//TAKES THE CONTROL TO THE NEXT LINE
        }
    }
}