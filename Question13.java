/*THIS PROGRAM EXECUTES A RECURRING FUNCTION TO CALCULATE FACTORIAL OF A NUMBER 
 * FACTORIAL:PRODUCT OF NUMBERS FROM 1 TO THAT NUMBER IN INCREASING ORDER WRITTEN AS !
 * EG:3!=1*2*3=6
 */
class Question13
{
    int fact(int m)//THIS IS A RECURSIVE METHOD THAT CALCULATES FACTORIAL OF m
    {
        if(m==1)
        return m;
        else
        return (m*fact(m-1));//RECURSION STATEMENT
    }
    void call(int m)
    {
        System.out.println("FACTORIAL OF "+m+" = "+new Question13().fact(m));//FUNCTION CALL
    }
}