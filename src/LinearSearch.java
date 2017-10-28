//SEARCHING:	Linear Search/Sequential Search--
//		is a method for finding a target value within a list.

import java.util.Scanner;

public class LinearSearch
{
   public static void main(String args[])
   {
       int arr[] = new int[10];
       int i, num, n, c=0, pos=0;
       Scanner scan = new Scanner(System.in);

       //First:	Enter Array Size
       //	User input how many values to be inserted

       System.out.print("Please Enter Size Values of Data to be inputted : \n");
       n = scan.nextInt();
	   
       //Second:    Enter Array Elements
       //           User input each array values

       System.out.print("Please Enter Array Elements : \n");
       for(i=0; i<n; i++)
       {
           arr[i] = scan.nextInt();
       }
       
       
        //Third:    Enter the value to be Searched

       System.out.print("Please Enter the Number Value to be Search... \n");
       num = scan.nextInt();
                   
       for(i=0; i<n; i++)
       {
           if(arr[i] == num)
           {
               c = 1;
               pos = i+1;
               break;
           }
       }
       
       //Fourth:    If the value is not found return:
       //           "Number not found"
       
       if(c == 0)
       {
           System.out.print("Number Not Found..!!");
       }
       
       //Fifth:	If the value is found, return:
       //       The position place of the value searched
       else
       {
           System.out.print( num + " found at position " + pos );
           System.out.print( "\n");
       }
   }
}