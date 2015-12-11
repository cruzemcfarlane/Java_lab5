/**
 * @Author: Cruze McFarlane
 * @ID: 620040546
 * @Lab: 5
 */
package Lab5;
import java.util.*;

public class Grade
{
    public static void main(String[] args)
    {
        //ArrayStat[] arr;;
        double[] arr = new double[10];
        Scanner scan = new Scanner(System.in);
        //Double input;
        double input;
        int reverse = arr.length;
        
        for (int count = 0; count < arr.length; count++)
        {
            System.out.print("Enter grade: ");
            input = scan.nextDouble();
            
            arr[count] = input;
        }
        
        System.out.print("\nGrades:");
        for(double value: arr)
        {
            System.out.println("\t" +value);
        }
                
        System.out.print("\nRev:");
        while(reverse > 0)
        {
            reverse--;
            System.out.println("\t" +arr[reverse]);                
        }
        
        for(int index = 0; arr.length > index; index++)
        {
            if(arr[index] >= 47 && arr[index] <= 49)
            {
                arr[index] = 50;
            }
            
            else if(arr[index] >=67 && arr[index] <= 69)
            {
                arr[index] = 70;
            }
        }
        
        System.out.print("\nUpdate:");
        for(double i: arr)
        {
             System.out.print("\t" +i);
              System.out.println();
        }
        
        //System.out.print("\nAverage: " +ArrayStat(arr));
        System.out.print("\nAverage: " +ArrayStat.average(arr));
    }
}