1
1 2 1
1 2 3 2 1
1 2 3 4 3 2 1
1 2 3 4 5 4 3 2 1
1 2 3 4 5 6 5 4 3 2 1
1 2 3 4 5 6 7 6 5 4 3 2 1

import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing first half of the row
             
            for (int j = 1; j <= i; j++) 
            { 
                System.out.print(j+" "); 
            }
             
            //Printing second half of the row 
             
            for (int j = i-1; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}


2.1234567
  234567
    34567
      4567
        567
          67
            7
          67
        567
      4567
    34567
  234567
1234567





import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        //Printing upper half of the pattern
         
        for (int i = 1; i <= rows; i++) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++) 
            { 
                System.out.print(j); 
            } 
             
            System.out.println(); 
        } 
         
        //Printing lower half of the pattern 
         
        for (int i = rows-1; i >= 1; i--) 
        {
            //Printing i spaces at the beginning of each row
             
            for (int j = 1; j < i; j++) 
            {
                System.out.print(" ");
            }
             
            //Printing i to rows value at the end of each row
             
            for (int j = i; j <= rows; j++)
            {
                System.out.print(j);
            }
             
            System.out.println();
        }
         
        //Closing the resources
         
        sc.close();
    }
}

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 
6 5 4 3 2 1
7 6 5 4 3 2 1


import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }
}

Pattern programs in java : Pattern 12

1
10
101
1010
10101
101010 
1010101


import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}

1
2 1
3 2 1
4 3 2 1
5 4 3 2 1 
6 5 4 3 2 1
7 6 5 4 3 2 1


import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        //Taking rows value from the user
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print(j+" ");
            }
             
            System.out.println();
        }
         
        //Close the resources
         
        sc.close();
    }
}

Pattern programs in java : Pattern 12

1
10
101
1010
10101
101010 
1010101


import java.util.Scanner;
 
public class MainClass
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("How many rows you want in this pattern?");
         
        int rows = sc.nextInt();
         
        System.out.println("Here is your pattern....!!!");
         
        for (int i = 1; i <= rows; i++) 
        {
            for (int j = 1; j <= i; j++)
            {
                if(j%2 == 0)
                {
                    System.out.print(0);
                }
                else
                {
                    System.out.print(1);
                }
            }
             
            System.out.println();
        }
         
        sc.close();
    }
}

	* 
   * * 
  * * * 
 * * * * 
* * * * * 
import java.io.*; 

// Java code to demonstrate star pattern 
public class GeeksForGeeks 
{ 
	// Function to demonstrate printing pattern 
	public static void printTriagle(int n) 
	{ 
		// outer loop to handle number of rows 
		// n in this case 
		for (int i=0; i<n; i++) 
		{ 

			// inner loop to handle number spaces 
			// values changing acc. to requirement 
			for (int j=n-i; j>1; j--) 
			{ 
				// printing spaces 
				System.out.print(" "); 
			} 

			// inner loop to handle number of columns 
			// values changing acc. to outer loop 
			for (int j=0; j<=i; j++ ) 
			{ 
				// printing stars 
				System.out.print("* "); 
			} 

			// ending line after each row 
			System.out.println(); 
		} 
	} 
	
	// Driver Function 
	public static void main(String args[]) 
	{ 
		int n = 5; 
		printTriagle(n); 
	} 
} 
