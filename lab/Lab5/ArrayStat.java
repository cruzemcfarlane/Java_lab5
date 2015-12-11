/**
 * @Author: Cruze McFarlane
 * @ID: 620040546
 * @Lab: 5
 */
package Lab5;


/**
 * This class has static methods that accept an array as parameter(s).
 * 
 * @Alfred Nonymous 
 * @1.00
 */
public class ArrayStat
{
   //private double[] array;
   /*private static double[] array = new double[10];;
   public ArrayStat(double a[])
   {
       array = a;
       
   }*/
    
    /**
     * Static method to compute the average of the values in an array
     * @param a an array of values
     * @return the average of the values in the array
     */
    public static double average(double a[]) 
    {
        double sum = 0, avg = 0;
        
        for(double value: a)
        {
            sum += value;
        }
        
        avg = sum / a.length;
        
        return avg;
    }
}