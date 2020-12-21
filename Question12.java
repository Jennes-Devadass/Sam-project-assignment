/*THIS PROGRAM CALCULATES LCM AND GCD OF 2 NUMBERS
 *THE FORMULA USED:PRODUCT OF 2 NUMBERS=LCM*GCD
 */
class Question12
{
    int a,b;
    Question12(int x,int y)//PARAMETERIZED CONSTRUCTOR
    {
        a=x;
        b=y;
    }
    void Calculate()//THIS METHOD CALCULATES LCM ANG GCD OF a AND b
    {
        int max=Math.max(a,b);
        int min=Math.min(a,b);
        int r=0,g=0,p=0,l=0;//VARIABLES TO BE USED
        while(true)
        {
            r=max%min;
            if(r==0)
            {
                g=min;//CALCULATES VALUE OF GCD
                break;
            }
            else
            {
                max=min;
                min=r;
            }
        }
        p=a*b;
        l=p/g;//CALCULATES VALUE OF LCM
        System.out.println("LCM OF "+a+" AND "+b+" = "+l);
        System.out.println("GCD OF "+a+" AND "+b+" = "+g);
    }
}