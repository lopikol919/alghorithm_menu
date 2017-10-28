//SORTING:	Insertion sort--	
//		Insertion sort is a simple sorting algorithm that works the way we sort playing cards in our hands.

import java.util.Scanner;

public class InsertionSort
{
   public static void main(String args[])
   {
       int size, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
       
       //First:	
       //Need to enter the value of datas to be inserted, ex:
	   
       System.out.print("Please Enter Size Values of Data to be Sorted   : ");
       size = scan.nextInt();
	   
       //Second:	
       //Enter values you prefer in any order
       
       System.out.print("Please Enter Array Elements One by one : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
  
       //Third:	Compare 1st array inputted, to the 2nd data input
       //	if 1st array has bigger value than the 2nd, ex:
       //	Condition "10>5" therefore switch their places, ex:
       //	if not leave as is
       
       System.out.print("Sorting Array using Insertion Sort Technique..\n");
       for(i=0; i<size; i++)
       {
           for(j=i+1; j<size; j++)
           {
               if(arr[i] > arr[j])
               {
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
               }
           }
       }
	  
       //Fifth:	Output results
       
       System.out.print("Array Sorted in Ascending Order :\n");
       for(i=0; i<size; i++)
       {
            System.out.print(arr[i] + "  ");
       }
   }
}