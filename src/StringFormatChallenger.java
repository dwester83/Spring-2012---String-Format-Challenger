// From Roxi: 9.5/10 - see comments in code for explanation
/*

Names: Daniel Wester, Spencer Davis



Lab 3: Part 1: use String.format() & System.out.printf() methods to format the output like:

The time is 04:08:27
The name is I.M. Here      
The age is 34 years
The wage is $22.45
The hours are 45.7
The pay is $1,025.97.

Part 2: Use JOptionPane.showInputDialog() to input the employee's name and age
	    Use Integer.parseInt() to convert the age read in as a String into an integer
        Display the output in a JOptionPane using JOptionPane.showMessageDialog()
*/

//import java.awt.*;
import javax.swing.*;

class StringFormatChallenger
{
	
	public static void main (String args[])
	{
		int hour = 4;
		int minutes = 8;
		int seconds = 27;
		String name = "I.M. Here";
		int age = 34;
		double wage = 22.45;
		double hoursWorked = 45.7;
		
        // Declare any other variables needed here
		
		double pay = (wage * hoursWorked);
	//	String employeeName;
	//	int employeeAge;
		// From Roxi: Pay is supposed to have comma editing between hundreds and thousands 
		// Use String.format() to format the output & write it to console
		
		String formatingString = String.format("%nString.format%nThe time is %02d:%02d:%02d%nThe name is %s%nThe age is %d years%nThe wage is $%.2f%nThe hours are %.1f%nThe pay is $%.2f.%n", 
			hour, minutes, seconds, name, age, wage, hoursWorked, pay);
		
		System.out.print(formatingString);
		
        // Use System.out.printf() to format output & write it to console
		
		System.out.printf("%nprintf%nThe time is %02d:%02d:%02d%nThe name is %s%nThe age is %d years%nThe wage is $%.2f%nThe hours are %.1f%nThe pay is $%.2f.%n", 
			hour, minutes, seconds, name, age, wage, hoursWorked, pay);
		
		// Part 2: Use JOptionPane.showInputDialog() to input the employee's name and age
		// Use Integer.parseInt() to convert the age read in as a String into an integer
        // Display all of the output in a JOptionPane using JOptionPane.showMessageDialog()
		
		name = JOptionPane.showInputDialog("Input name");
		age = Integer.parseInt(JOptionPane.showInputDialog("Input age"));
		formatingString = String.format("The time is %02d:%02d:%02d%nThe name is %s%nThe age is %d years%nThe wage is $%.2f%nThe hours are %.1f%nThe pay is %.2f%n", 
			hour, minutes, seconds, name, age, wage, hoursWorked, pay);
		JOptionPane.showMessageDialog(null,formatingString,"Output",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
	}
}

