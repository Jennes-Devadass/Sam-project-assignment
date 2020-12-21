/*This program calculates area of square,rectangle,or circle 
 * Program implements method overloading
 * Sides are inputted by parameterized input
 */
class Question9
{
    void Area(int a)//TO CALCULATE AREA OF SQUARE
    {
        int ans=a*a;//AREA=SIDE*SIDE
        System.out.println("AREA OF SQUARE = "+ans);
    }
    void Area(int l,int b)//TO CALCULATE AREA OF RECTANGLE
    {
        int ans=l*b;//AREA=LENGTH*BREADTH
        System.out.println("AREA OF RECTANGLE = "+ans);
    }
    void Area(float r)//TO CALCULATE AREA OF CIRCLE
    {
        float ans=(float)(Math.PI*Math.pow(r,2));//AREA=22/7*RADIUS*RADIUS
        System.out.println("AREA OF CIRCLE = "+ans);
    }
}