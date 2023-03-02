// Program: ShowNum
// Written by: Andrew Nguyen
// Description: User will input two integers and it will output the rows/columns with asterisks
// Challenges::Figuring out how to get the desired amount of rows and columns of asterisks.
// Time Spent:1 Hour 30 Mins
//
//                   Revision History
// Date:                   By:               Action:
// ---------------------------------------------------
// 05/31/2018         (initals)       Created
 
 
/* filename must be: Anyname.java */
import java.util.Scanner;
public class ShowNumClient 
{ 
public static void main(String args [ ] ) 
{ 
// Your Java statements here
Scanner scan = new Scanner(System.in);
int num1, num2, a;
System.out.println("Input Two Integers.");
num1 = scan.nextInt();
num2 = scan.nextInt();
ShowNum ShowNum1 = new ShowNum (num1);
ShowNum ShowNum2 = new ShowNum (num2);
ShowNum1.setnum1(num1);
ShowNum2.setnum2(num2);
System.out.println("Input: " +ShowNum1.getname()+ ", " +ShowNum2.getName()+ "\n");
a = 0;
while(a < num1){
    for(int i = 0; i < num2; i++) {
    System.out.printf("*");
    }
    System.out.printf("\n");
    a++;
}
}/*end main method */ 
}/*end class Anyname*/
