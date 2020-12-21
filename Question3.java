/*This program inputs electricity unit charges using Parameterized Input and calculates and
  display total electricity bill according to the given condition:
  For first 50 units Rs. 0.50/unit
  For next 100 units Rs. 0.75/unit
  For next 100 units Rs. 1.20/unit
  For unit above 250 Rs. 1.50/unit 
 * An additional surcharge of 20% is added to the bill
 */
class Question3
{
    void calculateBill(int n)//METHOD TO CALCULATE BILL
    {
        double b=0;
        if(n>0&&n<=50)
        b=0.5*n;
        else if(n>50&&n<=150)
        b=(50.0*0.5)+(0.75*(n-50));
        else if(n>150&&n<=250)
        b=(50.0*0.5)+(0.75*100)+(1.20*(n-150));
        else if(n>250)
        b=(50.0*0.5)+(0.75*100)+(1.20*100)+(1.50*(n-250));
        else
        {
        System.out.println("INVALID INPUT");
        b=0;
        }
        b=b+(.2/100*b);
        System.out.println("TOTAL BILL AMOUNT = "+b);//OUTPUT STATEMENT
    }
}


    
         
        
    