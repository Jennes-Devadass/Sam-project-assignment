/*This program displays the prime factors of a number passed as parameter
 * Prime factors are displayed only once
 */
class Question8
{
    void primeFactors(int n)
    {
        int c=0;
        for(int i=1;i<=n;i++)
        {
            c=0;
            if(n%i==0)
            {
              for(int j=1;j<=i;j++)
              {
                 if(i%j==0)
                  c++;
              }  
              if(c==2)
                System.out.println(i);
            }
        }   
    }
} 