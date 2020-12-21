/*This program displays the following pattern       
  
         *
        * *
       * * *
      * * * *
     * * * * * 
*/ 
  
  
 class Question6
{
    void display()
    {
        int i=0,j=0,k=0;//VARIABLES TO BE USED
        for(i=1;i<=5;i++)//OUTER LOOP
        {
            for(j=1;j<=(5-i);j++)
            {
              System.out.print(" ");//TO DISPLAY SPACES
            }
            for(k=1;k<=i;k++)
            {
                System.out.print("* ");//TO DISPLAY * WITH SPACE
            }
            System.out.println();//TO TAKE THE CONTROL TO THE NEXT LINE
        }
    }
}
        
            
       